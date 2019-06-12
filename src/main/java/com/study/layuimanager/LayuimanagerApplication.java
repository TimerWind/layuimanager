package com.study.layuimanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.study.layuimanager.dao")
public class LayuimanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuimanagerApplication.class, args);
    }

}
