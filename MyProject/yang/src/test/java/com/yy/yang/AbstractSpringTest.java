package com.yy.yang;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = YangApplication.class)
@TestPropertySource("classpath:application.properties")
public abstract class AbstractSpringTest {
}
