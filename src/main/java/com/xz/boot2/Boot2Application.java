package com.xz.boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot2Application.class, args);
        System.out.println("测试  http://localhost:8081/getUser/36 ");
    }

}
