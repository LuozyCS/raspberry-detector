package com.my.raspberrydetector;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication @MapperScan("com.my.raspberrydetector.dataAccessObject")
public class RaspberryDetectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaspberryDetectorApplication.class, args);
    }

}
