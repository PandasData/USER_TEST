package com.example.oracletest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.oracletest.mapper")
@SpringBootApplication
public class OracleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OracleTestApplication.class, args);
    }

}
