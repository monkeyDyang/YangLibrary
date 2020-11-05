package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodIDView;
import com.yy.domain.model.view.food.FoodUpdateView;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodDaoTest extends AbstractSpringTest {

    @Autowired
    private FoodDao dao;

    @Test
    void getList() {

        List<Food> list = dao.getList();

        int res = list.size();
        for (Food food:list)
            System.out.println(food.getFoodName());
        assertEquals(2,res);
    }

    @Test
    void getByID(){

        Integer id = 2;

        Food food = dao.getByID(id);

        assertEquals(id,food.getID());
    }

    @Test
    void getByName(){

        String Name = "测试2";
        Food food = dao.getByName(Name);
        System.out.println(food.getFoodName());
        assertEquals(Name,food.getFoodName());
    }

    @Test
    void insertFood(){

        Food food = new Food(0,"食物1",1,0,0);

        int res = dao.insertFood(food);

        System.out.println(res);
        assertEquals(1,res);
    }

    @Test
    void insertFoodList(){

        Food food = new Food(0,"食物",1,0,0);
        for (int i = 1; i<=10;i++){
            food.setWeight(i);
            food.setFoodName("食物" + i);
            dao.insertFood(food);
        }
    }

    @Test
    void updateFood(){

        FoodUpdateView view = new FoodUpdateView("食物change",1,0,0);
        Integer ID = 3;
        int res = dao.updateFoodByID(view,ID);

        assertEquals(1,res);
        Food food = dao.getByID(ID);
        System.out.println(food.getFoodName());
    }

    @Test
    void deleteFood(){

        FoodIDView view = new FoodIDView(2);
        Integer res = dao.deleteFood(view);
        assertEquals(1,res);

        // 如果传入的是空值，则不删除
        FoodIDView view2 = new FoodIDView();
        Integer res2 = dao.deleteFood(view2);
        assertEquals(0,res2);
    }

    @Test
    void updateList(){

        List<Food> list = dao.getList();
        System.out.println("更新前******************");
        int i = 1;
        for (Food food : list){
            // 更新权重
            System.out.println(food.toString());
            food.setFoodName("食物" + i);
            i++;
            food.setWeight(food.getWeight() + 1);
        }

        int res = dao.updateList(list);
        assertEquals(list.size(),res);
        System.out.println("更新后******************");
        List<Food> list2 = dao.getList();
        for (Food food : list2){
            // 更新权重
            System.out.println(food.toString());
        }

    }


}