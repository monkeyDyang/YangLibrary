package com.yy.domain.model.view.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 增加类型时使用的视图
public class FoodTypeView {
    private String typeName;
}
