package com.example.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiyun
 * @date 2019/7/10
 * @描述
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    @Value("${content}")
    String content;
    @RequestMapping("/")
    public String home() {
        return "content:" + content;
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
