package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodIDView;
import com.yy.domain.model.view.food.FoodUpdateView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDao {

    // 获取全部
    List<Food> getList();

    // 获取权值不为0的
    List<Food> getWeightNotZero();

    // 根据ID获取单个Food
    Food getByID(@Param("id") Integer id);

    // 根据Name获取单个Food
    Food getByName(String name);

    // 新增Food
    int insertFood(@Param("food") Food food);

    // 更新Food
    int updateFoodByID(@Param("food") FoodUpdateView food,@Param("ID") Integer ID);

    // 更新List<Food>
    int updateList(@Param("list") List<Food> list);

    // 删除Food
    int deleteFood(@Param("food") FoodIDView food);

    // 软删除Food
    int softDeleteFood(@Param("id") Integer id);
}
