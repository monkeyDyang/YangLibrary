package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.FoodType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodTypeDao {

    List<FoodType> getList();

    FoodType getByID(@Param("id") Integer id);

    FoodType getByName(@Param("name") String name);

    int insertFoodType(@Param("foodType") FoodType foodType);

    int updateFoodTypeByID(@Param("foodType") FoodType foodType,@Param("id") Integer id);

    int deleteFoodType(@Param("id") Integer id);
}
