package com.yy.domain.application.random;

import com.yy.domain.model.entity.food.Food;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 随机算法
 * */
public interface RandomAlgorithm {

    // 从一组待选项中获取一个结果
    Food getRandomResult(List<Food> foods);
}
