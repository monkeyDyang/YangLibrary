package com.yy.life.domain.model.entity.food;

import lombok.Data;

@Data
public class Food {

    // 自增ID id
    private int ID;

    // 名称   food_name
    private String foodName;

    // 权重   weight
    private int Weight;

    // 是否包含 is_include
    private int isInclude;

    // 是否删除 is_del
    private int isDel;

}
