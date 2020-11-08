package com.yy.domain.service;

import com.yy.domain.dao.food.FoodDao;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodServiceTest extends AbstractSpringTest {

    @Autowired
    private FoodService foodService;

    void show(List<Food> list){
        for (Food food: list){
            System.out.println(food.toString());
        }
    }

    @Test
    void getAll() {
        List<Food> list = foodService.getAll();

        int res = list.size();
        for (Food food:list)
            System.out.println(food.toString());
        assertTrue(res > 0);
    }

    @Test
    void getAllView(){
        foodService.getAllView();
    }


    @Test
    void getWeightNotZero(){
        List<Food> list = foodService.getWeightNotZero();
        show(list);
    }

    @Test
    void getByID(){
        FoodResultView food = foodService.getByID(15);
        FoodResultView food2 = foodService.getByID(14);
        FoodResultView food3 = foodService.getByID(13);
        System.out.println(food);;
    }
}