package com.yy.domain.service;

import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodResultView;

import java.util.List;

public interface FoodService {

    // 获取所有
    List<FoodResultView> getAllView();

    // 获取所有
    List<Food> getAll();

    // 获取权值不为0的
    List<Food> getWeightNotZero();

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
