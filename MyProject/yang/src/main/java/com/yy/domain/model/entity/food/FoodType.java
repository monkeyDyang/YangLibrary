package com.yy.domain.model.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodType implements Serializable {

    // 自增ID id
    private int ID;

    // 类型名称
    private String typeName;
}
