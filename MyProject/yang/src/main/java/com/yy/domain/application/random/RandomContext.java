package com.yy.domain.application.random;

import com.yy.domain.exception.Asserts;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class RandomContext {

    private final RandomAlgorithm algorithm;
    private final FoodService foodService;

    public RandomContext(RandomAlgorithm algorithm, FoodService foodService){
        this.algorithm = algorithm;
        this.foodService = foodService;
    }

    // 执行过程
    public Food execute(List<Food> foods) throws Exception {

        // 1、获取随机结果
        Food result = algorithm.getRandomResult(foods);

        if (result == null)
            Asserts.fail("未获取到随机结果");

        List<Food> others = foodService.getAll();
        others.remove(result);

        // 2、修改选中结果的权值，权值=0
        foodService.ChangeWeightToZero(result.getID());

        // 3、处理未选中option的权值，权值+1
        foodService.ChangeWeightAddOne(others);

        // 4、返回Food
        return result;
    }
}
