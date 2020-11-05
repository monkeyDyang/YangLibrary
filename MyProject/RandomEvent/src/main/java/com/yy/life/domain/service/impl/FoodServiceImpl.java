package com.yy.life.domain.service.impl;

import com.yy.life.domain.dao.food.FoodDao;
import com.yy.life.domain.model.entity.food.Food;
import com.yy.life.domain.model.view.food.FoodResultView;
import com.yy.life.domain.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodDao foodMapper;

    public FoodServiceImpl(FoodDao foodMapper) {
        this.foodMapper = foodMapper;
    }

    @Override
    public List<FoodResultView> getAll() {

        List<Food> list = foodMapper.getList();

        List<FoodResultView> results = new ArrayList<>();

        // 类型转化
        for (Food food:list){
            FoodResultView foodResult = new FoodResultView();
            foodResult.setID(food.getID());
            foodResult.setFoodName(food.getFoodName());
            foodResult.setWeight(food.getWeight());
            foodResult.setIsInclude(food.getIsInclude());
            foodResult.setIsDel(food.getIsDel());

            results.add(foodResult);
        }

        return results;
    }
}
