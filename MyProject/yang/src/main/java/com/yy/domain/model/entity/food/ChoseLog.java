package com.yy.domain.model.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoseLog implements Serializable {

    // 自增主键id
    private Integer ID;

    // 外键食物id
    private Integer foodID;

    // 外键 食物类型id
    private Integer foodTypeID;

    // 选择时间
    private Date choseTime;
}
