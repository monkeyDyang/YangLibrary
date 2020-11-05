package com.yy.life.domain.dao.food;

import com.yy.life.domain.model.entity.food.Food;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDao {

    // 获取全部
    @Select("select * from food")
    public List<Food> getList();

//    // 根据ID获取单个Food
//    Food getByID(int ID);
//
//    // 根据Name获取单个Food
//    Food getByName(String Name);

//    // 新增Food
//    int insertFood(@Param("food") FoodAddView food);
//
//    // 更新Food
//    int updateFood(@Param("food") FoodUpdateView food);
//
//    // 删除Food
//    int deleteFood(@Param("food") FoodDeleteView food);
}
