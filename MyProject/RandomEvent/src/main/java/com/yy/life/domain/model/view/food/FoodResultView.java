package com.yy.life.domain.model.view.food;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class FoodResultView {
    // 自增ID id
    private int ID;

    // 名称   food_name
    private String FoodName;

    // 权重   weight
    private int Weight;

    // 是否包含 is_include
    private int IsInclude;

    // 是否删除 is_del
    private int IsDel;
}
