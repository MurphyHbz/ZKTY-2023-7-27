package com.mys.zkty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mys.zkty.dao")
public class ZktyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZktyApplication.class, args);
    }

}
