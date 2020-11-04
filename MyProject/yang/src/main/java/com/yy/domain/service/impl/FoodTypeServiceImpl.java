package com.yy.domain.service.impl;

import com.yy.domain.dao.food.FoodTypeDao;
import com.yy.domain.model.entity.food.FoodType;
import com.yy.domain.model.view.food.FoodTypeView;
import com.yy.domain.service.FoodTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeServiceImpl implements FoodTypeService {

    private final FoodTypeDao foodTypeDao;

    public FoodTypeServiceImpl(FoodTypeDao foodTypeDao){
        this.foodTypeDao = foodTypeDao;
    }

    private FoodType TransformFoodType(FoodTypeView view){
        FoodType foodType = new FoodType();
        foodType.setTypeName(view.getTypeName());
        return foodType;
    }

    @Override
    public List<FoodType> getList() {
        return foodTypeDao.getList();
    }

    @Override
    public FoodType getByID(Integer ID) {
        return foodTypeDao.getByID(ID);
    }

    @Override
    public FoodType getByName(String Name) {
        return foodTypeDao.getByName(Name);
    }

    @Override
    public int addFoodType(FoodTypeView foodTypeAddView) {
        FoodType foodType = TransformFoodType(foodTypeAddView);
        return foodTypeDao.insertFoodType(foodType);
    }

    @Override
    public int changeFoodType(FoodTypeView foodTypeAddView, Integer ID) {
        FoodType foodType = TransformFoodType(foodTypeAddView);
        return foodTypeDao.updateFoodTypeByID(foodType,ID);
    }
}
