package com.yy.yang;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = YangApplication.class)
@TestPropertySource("classpath:application.properties")
@ComponentScan("com.yy.domain")
public abstract class AbstractSpringTest {
}
