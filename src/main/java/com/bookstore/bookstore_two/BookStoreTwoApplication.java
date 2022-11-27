package com.bookstore.bookstore_two;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import service.UserServiceimp;

@SpringBootApplication(scanBasePackages = {"controller","bean","service","Configure"})
public class BookStoreTwoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BookStoreTwoApplication.class, args);
    }

}
