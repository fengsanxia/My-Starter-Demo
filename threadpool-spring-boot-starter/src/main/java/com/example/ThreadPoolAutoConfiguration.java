package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 自动配置线程池
 * @Author: Trick
 * @Date: 2021/3/12 10:26
 * @Version: 1.0
 */
@Configuration
@ConditionalOnClass(ThreadPoolExecutor.class)
public class ThreadPoolAutoConfiguration {
    @Bean
    public ThreadPoolExecutor myThreadPool() {
        return new ThreadPoolExecutor(10, 10, 10,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));
    }
}
