package com.yy.domain.service;

import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodIDView;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.domain.model.view.food.FoodUpdateView;

import java.util.List;

public interface FoodService {

    // 获取所有
    List<FoodResultView> getAll();

    // 获取单个Food
    FoodResultView getByID(Integer id);

    // 获取单个Food
    FoodResultView getByName(String Name);

    // 修改FoodName
    int ChangeFoodName(Integer id, String Name);

    // 修改权重为0
    int ChangeWeightToZero(Integer id);

    // 批量权重+1
    int ChangeWeightAddOne(List<Food> views);

    // 软删除
    int softDeleteFood(Integer id);

}
