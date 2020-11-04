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

    @Test
    void getAll() {
        List<FoodResultView> list = foodService.getAll();

        int res = list.size();
        for (FoodResultView food:list)
            System.out.println(food.toString());
        assertEquals(2,res);
    }
}