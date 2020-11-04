package com.yy.domain.service;

import com.yy.domain.model.entity.food.FoodType;
import com.yy.domain.model.view.food.FoodTypeView;

import java.util.List;

public interface FoodTypeService {
    // 获取所有
    List<FoodType> getList();

    // 根据ID获取单个类型
    FoodType getByID(Integer ID);

    // 根据名字获取单个类型
    FoodType getByName(String Name);

    // 新增类型
    int addFoodType(FoodTypeView foodTypeAddView);

    // 修改类型名称
    int changeFoodType(FoodTypeView foodTypeAddView,Integer ID);

}
