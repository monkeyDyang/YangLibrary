package com.yy.domain.service.impl;

import com.yy.domain.dao.food.ChoseLogDao;
import com.yy.domain.model.entity.food.ChoseLog;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.entity.food.FoodType;
import com.yy.domain.service.ChoseLogService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ChoseLogServiceImpl implements ChoseLogService {

    private final ChoseLogDao choseLogDao;

    public ChoseLogServiceImpl(ChoseLogDao choseLogDao){
        this.choseLogDao = choseLogDao;
    }

    @Override
    public List<ChoseLog> getList() {
        return choseLogDao.getList();
    }

    @Override
    public List<ChoseLog> getListByFoodID(Integer foodID) {
        return choseLogDao.getListByFoodID(foodID);
    }

    @Override
    public List<ChoseLog> getListByFoodTypeID(Integer foodTypeID) {
        return choseLogDao.getListByFoodTypeID(foodTypeID);
    }

    @Override
    public int addChoseLog(Food food, FoodType foodType) {

        // 判断ID是否存在
        if (food.getID() == 0 || food == null)
            return 0;
        if (foodType.getID() == 0 || foodType == null)
            return 0;

        ChoseLog choseLog = new ChoseLog();
        choseLog.setFoodID(food.getID());
        choseLog.setFoodTypeID(foodType.getID());
        choseLog.setChoseTime(new Date());
        // addChoseLog
        int addFlag = choseLogDao.insertChoseLog(choseLog);

        return addFlag;
    }
}
