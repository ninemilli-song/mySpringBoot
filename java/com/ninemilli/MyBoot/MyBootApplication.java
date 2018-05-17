package com.ninemilli.MyBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyBootApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        // 启动Spring Boot项目
        SpringApplication app = new SpringApplication(MyBootApplication.class);
        app.run(args);
    }
}
