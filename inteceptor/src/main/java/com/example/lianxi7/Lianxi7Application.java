package com.example.lianxi7;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guangzhao.mapper")
public class Lianxi7Application {

    public static void main(String[] args) {
        SpringApplication.run(Lianxi7Application.class, args);
    }

}
