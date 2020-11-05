package com.yy.life.domain.model.entity.food;

import lombok.Data;

@Data
public class ChoseLog {

    // 自增主键id
    private int ID;

    // 外键食物id
    private int FoodID;

    // 外键 食物类型id
    private int FoodTypeID;
}
