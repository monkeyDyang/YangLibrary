package com.yy.domain.service.impl;

import com.yy.domain.dao.food.FoodDao;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.domain.model.view.food.FoodUpdateView;
import com.yy.domain.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodDao foodMapper;

    public FoodServiceImpl(FoodDao foodMapper) {
        this.foodMapper = foodMapper;
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
    public List<FoodResultView> getAll() {

        List<Food> list = foodMapper.getList();
        List<FoodResultView> results = new ArrayList<>();
        // 类型转化
        for (Food food:list){
            FoodResultView foodResult = TransformFood(food);
            results.add(foodResult);
        }
        return results;
    }

    @Override
    public FoodResultView getByID(Integer id) {
        return TransformFood(foodMapper.getByID(id));
    }

    @Override
    public FoodResultView getByName(String Name) {
        return TransformFood(foodMapper.getByName(Name));
    }


    @Override
    public int ChangeFoodName(Integer id, String Name) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setFoodName(Name);
        return foodMapper.updateFoodByID(updateView,id);
    }

    @Override
    public int ChangeWeightToZero(Integer id) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setWeight(0);
        return foodMapper.updateFoodByID(updateView,id);
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

        return foodMapper.updateList(entities);
    }

    @Override
    public int softDeleteFood(Integer id) {
        return foodMapper.softDeleteFood(id);
    }
}
