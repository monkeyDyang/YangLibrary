package com.yy.domain.controller.food;

import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodAddView;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.domain.model.view.food.FoodUpdateView;
import com.yy.domain.service.FoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "食物接口")
@RestController
@RequestMapping("restful/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    // get by ID
    @ApiOperation(value = "获取Food",notes="根据ID获取Food", produces="application/json")
    @GetMapping(value = "/id/{id}")
    public ResponseEntity<FoodResultView> getByID(@PathVariable("id") Integer id){
        try {
            FoodResultView food = foodService.getByID(id);
            if (food == null)
                //404 资源不存在
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            // 200
            return ResponseEntity.status(HttpStatus.OK).body(food);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @ApiOperation(value = "获取Food",notes = "根据Name获取Food",produces = "application/json")
    @GetMapping(value = "/name/{name}")
    //@PathVariable可以用来映射URL中的占位符到目标方法的参数中
    public ResponseEntity<FoodResultView> getByName(@PathVariable("name") String Name){
        try {
            FoodResultView food = foodService.getByName(Name);
            if (food == null)
                //404 资源不存在
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            // 200
            return ResponseEntity.status(HttpStatus.OK).body(food);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    // add a food
    @ApiOperation(value = "新增Food",notes = "新增一个Food",produces = "application/json")
    @PostMapping
    public ResponseEntity<Void> addFood(FoodAddView view){
        try{
            foodService.saveFood(view);
            // 201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

//    // update a food
//    @ApiOperation(value = "更新Food")
//    @ResponseBody
//    @PutMapping
//    public ResponseEntity<Void> updateFood(FoodUpdateView view){
//        try {
//            foodService.ChangeFoodName();
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // 500
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }


}
