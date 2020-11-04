package com.yy.domain.service;

import com.yy.domain.model.entity.food.ChoseLog;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.entity.food.FoodType;

import java.util.List;

public interface ChoseLogService {

    List<ChoseLog> getList();

    List<ChoseLog> getListByFoodID(Integer foodID);

    List<ChoseLog> getListByFoodTypeID(Integer foodTypeID);

    int addChoseLog(Food food, FoodType foodType);
}
