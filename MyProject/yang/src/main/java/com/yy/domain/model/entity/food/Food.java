package com.yy.domain.model.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food implements Cloneable, Serializable {

    // 自增ID id
    private Integer ID;

    // 名称   food_name
    private String foodName;

    // 权重   weight
    private Integer Weight;

    // 是否包含 is_include
    private Integer isInclude;

    // 是否删除 is_del
    private Integer isDel;

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
