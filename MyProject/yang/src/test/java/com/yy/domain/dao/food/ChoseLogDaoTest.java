package com.yy.domain.dao.food;

import com.yy.domain.model.entity.food.ChoseLog;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChoseLogDaoTest extends AbstractSpringTest {

    @Autowired
    private ChoseLogDao dao ;

    @Test
    void getList() {
        List<ChoseLog> list = dao.getList();
        assertTrue(list.size()> 0);

        for (ChoseLog log : list)
            System.out.println(log.toString());
    }

    @Test
    void getListByFoodID() {
        List<ChoseLog> list = dao.getListByFoodID(3);
        assertTrue(list.size()> 0);
    }

    @Test
    void getListByFoodTypeID() {
        List<ChoseLog> list = dao.getListByFoodTypeID(1);
        assertTrue(list.size()> 0);
    }
}