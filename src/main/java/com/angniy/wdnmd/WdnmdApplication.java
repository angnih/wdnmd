package com.angniy.wdnmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.angniy.wdnmd.mapper")
@SpringBootApplication
public class WdnmdApplication {

    public static void main(String[] args) {
        SpringApplication.run(WdnmdApplication.class, args);
    }

}
