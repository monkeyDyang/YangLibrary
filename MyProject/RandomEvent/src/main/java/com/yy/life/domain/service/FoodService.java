package com.yy.life.domain.service;

import com.yy.life.domain.model.view.food.FoodResultView;

import java.util.List;

public interface FoodService {

    // 获取所有
    List<FoodResultView> getAll();
}
