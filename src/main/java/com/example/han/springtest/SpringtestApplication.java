package com.example.han.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"project.controller"})
@SpringBootApplication
public class SpringtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
    }

}
