package com.yy.domain.application.random;

import com.yy.domain.application.random.impl.YangRandom;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.service.FoodService;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class RandomContextTest extends AbstractSpringTest {

    @Autowired
    private FoodService service;

    @Test
    void execute() throws Exception {

        RandomContext context = new RandomContext(new YangRandom(),this.service);
        List<Food> resultList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            List<Food> list = service.getWeightNotZero();
            Food result = context.execute(list);
            resultList.add(result);
        }

        count(resultList);
    }

    void count(List<Food> resultList){
        Map<Integer,List<Food>> allCounting = resultList.stream().collect(
                Collectors.groupingBy(Food::getID)
        );

        for (Map.Entry<Integer,List<Food>> entry : allCounting.entrySet()){

            Food food = get(resultList,entry.getKey());
            System.out.println("key:" + food.getFoodName() + "   value:" + entry.getValue().size());
        }
    }

    private Food get(List<Food> list,Integer ID){
        Food res = new Food();
        for (Food food : list){
            if (food.getID().equals(ID))
                res = food;
        }
        return res;
    }
}