package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description: 测试自定义starter
 * @Author: Trick
 * @Date: 2021/3/12 15:17
 * @Version: 1.0
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class demoTest {
    @Autowired
    private ThreadPoolExecutor myThreadPool;

    @Test
    public void test() {
        System.out.println(myThreadPool.getCorePoolSize());
    }

}
