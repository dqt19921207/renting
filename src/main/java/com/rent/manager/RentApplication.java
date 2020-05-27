package com.rent.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan(basePackages = {"com.rent.manager.mapper","com.rent.manager.mapper.xml"})
public class RentApplication {

    public static void main(String[] args) {

        SpringApplication.run(RentApplication.class, args);
    }

}
