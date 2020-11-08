package com.yy.domain.redis;

import com.yy.domain.model.entity.food.Food;
import com.yy.yang.AbstractSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest extends AbstractSpringTest {

    @Autowired
    @Qualifier("RedisTemplate")
    private RedisTemplate redisTemplate;

    @Test
    public void addTest(){

        Food food = new Food(1,"杨洋",1,1,1);

        redisTemplate.opsForValue().set("yy",food);
        System.out.println(redisTemplate.opsForValue().get("yy"));
    }
}
