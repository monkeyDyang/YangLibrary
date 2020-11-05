package com.yy.domain.application.random.impl;

import com.yy.domain.application.random.RandomAlgorithm;
import com.yy.domain.model.entity.food.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *  参考LeetCode 528按权重随机选择
 * */
@Service
public class YangRandom implements RandomAlgorithm {

    @Override
    public Food getRandomResult(List<Food> foods) {

        List<Integer> psum = new ArrayList<>();

        // 1、set options Array
        Food[] options = foods.toArray(new Food[0]);

        // 2、get 权值Array
        int total = 0;
        total = getWeightArray(options,psum);

        // 3、get a target
        // 获取时间戳
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        int target = random.nextInt(total);

        // 4、get result index
        int resultIndex = getRandomIndex(target,psum);

        return options[resultIndex];
    }

    // 二分查找法
    private int getRandomIndex(int target,List<Integer> psum){
        int left = 0;
        int right = psum.size() - 1;
        while (left != right){
            int mid = (left + right) / 2;
            if (target >= psum.get(mid))
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    // get WeightArray
    private int getWeightArray(Food[] options,List<Integer> psum){
        int total = 0;
        for (Food food : options){
            total += food.getWeight();
            psum.add(total);
        }
        return total;
    }
}
