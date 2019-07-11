package com.example.eurekaprovider3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProvider3Application {
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "Hello world"+port;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider3Application.class, args);
    }

}
