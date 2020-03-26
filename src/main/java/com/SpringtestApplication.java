package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 1.开启基于注解的缓存：@EnableCaching
 * 2.标注缓存注解：
 * @Cacheable 标注方法是可缓存的。
 * 
 * 
 */
@SpringBootApplication
@EnableCaching
public class SpringtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
    }

}
