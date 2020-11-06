package com.yy.domain.controller.random;

import com.yy.domain.application.random.RandomContext;
import com.yy.domain.application.random.impl.YangRandom;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.service.FoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "随机事件接口")
@RequestMapping("/random")
public class RandomController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    @ApiOperation(value = "获取一个随机Food",notes = "从权重不为0中获取一个")
    public ResponseEntity<Food> getRandomFood() throws Exception{
        RandomContext randomContext = new RandomContext(new YangRandom(),this.foodService);
        List<Food> list = foodService.getWeightNotZero();
        if (list.size() <= 0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        Food result =  randomContext.execute(list);
        if (result == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
