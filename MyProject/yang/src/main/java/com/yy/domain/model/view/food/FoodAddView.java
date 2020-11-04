package com.yy.domain.model.view.food;

import lombok.Data;

@Data
public class FoodAddView {

    // 名称   food_name
    private String foodName;

    public FoodAddView(String foodName){
        this.foodName = foodName;
    }
}
