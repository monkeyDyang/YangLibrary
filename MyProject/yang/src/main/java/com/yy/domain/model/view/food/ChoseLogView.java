package com.yy.domain.model.view.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoseLogView {
    // 外键食物id
    private Integer foodID;

    // 外键 食物类型id
    private Integer foodTypeID;

    // 选择时间
    private Date choseTime;
}
