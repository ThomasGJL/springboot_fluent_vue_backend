package com.example.springbootfluentvue.config;

import cn.org.atool.fluent.mybatis.spring.MapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MapperFactory mapperFactory() {

        return new MapperFactory();

    }

}
