package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.FoodType;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodTypeDaoTest extends AbstractSpringTest {

    @Autowired
    private FoodTypeDao dao;

    @Test
    void getList() {
        List<FoodType> list = dao.getList();
        assertTrue(list.size()>0);
        for (FoodType foodType : list)
            System.out.println(foodType.toString());
    }

    @Test
    void getByID() {
        FoodType foodType = dao.getByID(1);
        System.out.println(foodType.getID());
    }

    @Test
    void getByName() {
        FoodType foodType = dao.getByName("type1");
        System.out.println(foodType.getTypeName());
    }

    @Test
    void insertFoodType() {
        FoodType foodType = new FoodType(0,"类型Test");
        int res = dao.insertFoodType(foodType);
        assertEquals(1,res);
    }

    @Test
    void updateFoodTypeByID() {
        FoodType foodType = new FoodType(0,"类型Change");
        int id = 1;
        int res = dao.updateFoodTypeByID(foodType,id);
        assertEquals(1,res);

    }

    @Test
    void deleteFoodType() {
        int res = dao.deleteFoodType(2);
        assertEquals(1,res);
    }
}