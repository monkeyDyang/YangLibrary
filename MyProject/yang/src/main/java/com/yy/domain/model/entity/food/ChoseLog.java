package com.yy.domain.model.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoseLog {

    // 自增主键id
    private int ID;

    // 外键食物id
    private int foodID;

    // 外键 食物类型id
    private int foodTypeID;

    // 选择时间
    private Date choseTime;
}
