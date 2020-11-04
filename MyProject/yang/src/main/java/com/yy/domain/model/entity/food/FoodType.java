package com.yy.domain.model.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodType {

    // 自增ID id
    private int ID;

    // 类型名称
    private String typeName;
}
