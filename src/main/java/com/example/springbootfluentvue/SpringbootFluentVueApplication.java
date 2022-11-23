package com.example.springbootfluentvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootfluentvue.mapper")
public class SpringbootFluentVueApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootFluentVueApplication.class, args);

    }

}
