package com.yy.domain.application.random.impl;

import com.yy.domain.application.random.RandomAlgorithm;
import com.yy.domain.model.entity.food.Food;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PrimitiveRandom implements RandomAlgorithm {
    @Override
    public Food getRandomResult(List<Food> foods) {

        Random random = new Random();
        int target = random.nextInt(foods.size());
        Food result = foods.get(target);
        return result;
    }
}
