package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.code.mapper")
public class HouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class,args);
    }
}
