package com.bookstore.bookstore_two;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.redis.core.StringRedisTemplate;
import service.UserServiceimp;

import javax.annotation.Resource;

@SpringBootApplication(scanBasePackages = {"controller","bean","service","Configure"})
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(value = {"com.bookstore.bookstore_two","controller","service","configure","bean"},
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,
//                pattern = "com.jiaobuchong.business\\..*"),
//                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.jiaobuchong.user.service\\..*")}
//)

@ServletComponentScan
public class BookStoreTwoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BookStoreTwoApplication.class, args);
    }

}
