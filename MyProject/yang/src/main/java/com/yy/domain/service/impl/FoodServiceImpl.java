package com.yy.domain.service.impl;

import com.yy.domain.dao.food.FoodDao;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodAddView;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.domain.model.view.food.FoodUpdateView;
import com.yy.domain.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodDao foodDao;

    public FoodServiceImpl(FoodDao foodMapper) {
        this.foodDao = foodMapper;
    }

    // Food 转化成 FoodResultView
    private FoodResultView TransformFood(Food food){
        FoodResultView resultView = new FoodResultView();

        resultView.setID(food.getID());
        resultView.setFoodName(food.getFoodName());
        resultView.setIsDel(food.getIsDel());
        resultView.setIsInclude(food.getIsInclude());
        resultView.setWeight(food.getWeight());

        return resultView;
    }
    // FoodResultView 转化成 Food
    private Food TransformFoodResultView(FoodResultView food){
        Food resultView = new Food();

        resultView.setID(food.getID());
        resultView.setFoodName(food.getFoodName());
        resultView.setIsDel(food.getIsDel());
        resultView.setIsInclude(food.getIsInclude());
        resultView.setWeight(food.getWeight());

        return resultView;
    }

    @Override
    public List<FoodResultView> getAllView() {

        List<Food> list = foodDao.getList();
        List<FoodResultView> results = new ArrayList<>();
        // 类型转化
        for (Food food:list){
            FoodResultView foodResult = TransformFood(food);
            results.add(foodResult);
        }
        return results;
    }

    @Override
    public List<Food> getAll() {
        return foodDao.getList();
    }

    @Override
    public List<Food> getWeightNotZero() {
        return foodDao.getWeightNotZero();
    }

    @Override
    public FoodResultView getByID(Integer id) {

        Food food = foodDao.getByID(id);
        if (food == null)
            return null;
        return TransformFood(food);
    }

    @Override
    public FoodResultView getByName(String Name) {

        Food food = foodDao.getByName(Name);
        if (food == null)
            return null;
        return TransformFood(food);
    }

    @Override
    public int saveFood(FoodAddView view) {
        Food food = new Food();
        food.setFoodName(view.getFoodName());
        return foodDao.insertFood(food);
    }

    @Override
    public int ChangeFoodName(Integer id, String Name) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setFoodName(Name);
        return foodDao.updateFoodByID(updateView,id);
    }

    @Override
    public int ChangeWeightToZero(Integer id) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setWeight(0);
        return foodDao.updateFoodByID(updateView,id);
    }

    @Override
    public int ChangeWeightAddOne(List<Food> list) {

        List<Food> entities = new ArrayList<>();
        for (Food food : list){
            Food entity = new Food();
            entity.setID(food.getID());
            entity.setFoodName(food.getFoodName());
            entity.setWeight(food.getWeight() + 1);

            entities.add(entity);
        }

        return foodDao.updateList(entities);
    }

    @Override
    public int softDeleteFood(Integer id) {
        return foodDao.softDeleteFood(id);
    }
}
