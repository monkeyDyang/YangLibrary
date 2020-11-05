package com.yy.yang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.yy.domain.dao")
@ComponentScan(basePackages = {"com.yy"})
public class YangApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangApplication.class, args);
    }

}
