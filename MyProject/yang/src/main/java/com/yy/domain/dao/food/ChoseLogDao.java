package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.ChoseLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoseLogDao {

    List<ChoseLog> getList();

    List<ChoseLog> getListByFoodID(@Param("foodID")Integer foodID);

    List<ChoseLog> getListByFoodTypeID(@Param("foodTypeID") Integer foodTypeID);

    int insertChoseLog(@Param("choseLog") ChoseLog choseLog);
}
