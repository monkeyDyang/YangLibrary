package com.yy.domain.model.view.food;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class FoodAddView {

    // 名称   food_name
    @ApiModelProperty(value = "食物名称")
    private String foodName;
}
