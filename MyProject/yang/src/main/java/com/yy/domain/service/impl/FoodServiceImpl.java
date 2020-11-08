package com.yy.domain.service.impl;

import com.yy.domain.dao.food.FoodDao;
import com.yy.domain.model.entity.food.Food;
import com.yy.domain.model.view.food.FoodAddView;
import com.yy.domain.model.view.food.FoodResultView;
import com.yy.domain.model.view.food.FoodUpdateView;
import com.yy.domain.service.FoodService;
import com.yy.domain.utils.RedisUtil;
import com.yy.domain.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = "'foodService'")
public class FoodServiceImpl implements FoodService {

    /**
     * @Cacheable 缓存有数据时，从缓存获取；没有数据时，执行方法，并将返回值保存到缓存中
     * @Cacheable 一般在查询中使用
     * 1) cacheNames 指定缓存区，没有配置使用@CacheConfig指定的缓存区
     * 2) key 指定缓存区的key
     * 3) 注解的值使用SpEL表达式
     * eq ==
     * lt <
     * le <=
     * gt >
     * ge >=
     */

    private final FoodDao foodDao;
//    @Autowired
//    private RedisUtil redisUtil;

    public FoodServiceImpl(FoodDao foodMapper) {
        this.foodDao = foodMapper;
    }

    // Food 转化成 FoodResultView
    private FoodResultView TransformFood(Food food){
        FoodResultView resultView = new FoodResultView();

        resultView.setID(food.getID());
        resultView.setFoodName(food.getFoodName());
        resultView.setIsDel(food.getIsDel());
        resultView.setIsInclude(food.getIsInclude());
        resultView.setWeight(food.getWeight());

        return resultView;
    }
    // FoodResultView 转化成 Food
    private Food TransformFoodResultView(FoodResultView food){
        Food resultView = new Food();

        resultView.setID(food.getID());
        resultView.setFoodName(food.getFoodName());
        resultView.setIsDel(food.getIsDel());
        resultView.setIsInclude(food.getIsInclude());
        resultView.setWeight(food.getWeight());

        return resultView;
    }

    @Override
    @Cacheable(key = "'foods'")
    public List<FoodResultView> getAllView() {

        List<Food> list = foodDao.getList();
        List<FoodResultView> results = new ArrayList<>();
        // 类型转化
        for (Food food:list){
            FoodResultView foodResult = TransformFood(food);
            results.add(foodResult);
        }
        return results;
    }

    @Override
    @Cacheable(key = "'foods'")
    public List<Food> getAll() {

        return foodDao.getList();
    }

    @Override
//    @CachePut(key = "'foodNotZero'")
    public List<Food> getWeightNotZero() {
        return foodDao.getWeightNotZero();
    }

    @Override
    // 每次都会执行方法，并将结果存入指定的缓存中
    @Cacheable(key = "#id",unless = "#result == null ")
    public FoodResultView getByID(Integer id) {
        FoodResultView result = null;

        Food food = foodDao.getByID(id);
        if (food != null) {
            result = TransformFood(food);
        }
        return result;
    }

    @Override
    // 每次都会执行方法，并将结果存入指定的缓存中
    @Cacheable(key = "#Name",unless = "#result == null ")
    public FoodResultView getByName(String Name) {

        Food food = foodDao.getByName(Name);
        if (food == null)
            return null;
        return TransformFood(food);
    }

    @Override
    @CacheEvict(key = "'foods'")
    public int saveFood(FoodAddView view) {
        Food food = new Food();
        food.setFoodName(view.getFoodName());
        return foodDao.insertFood(food);
    }

    @Override
    @CacheEvict(key = "'foods'")
    public int ChangeFoodName(Integer id, String Name) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setFoodName(Name);
        return foodDao.updateFoodByID(updateView,id);
    }

    @Override
    @CacheEvict(key = "'foods'")
    public int ChangeWeightToZero(Integer id) {
        FoodUpdateView updateView = new FoodUpdateView();
        updateView.setWeight(0);
        return foodDao.updateFoodByID(updateView,id);
    }

    @Override
    @CacheEvict(key = "'foods'")
    public int ChangeWeightAddOne(List<Food> list) {

        List<Food> entities = new ArrayList<>();
        for (Food food : list){
            Food entity = new Food();
            entity.setID(food.getID());
            entity.setFoodName(food.getFoodName());
            entity.setWeight(food.getWeight() + 1);

            entities.add(entity);
        }

        return foodDao.updateList(entities);
    }

    @Override
    @CacheEvict(key = "'foods'")
    public int softDeleteFood(Integer id) {
        return foodDao.softDeleteFood(id);
    }
}
