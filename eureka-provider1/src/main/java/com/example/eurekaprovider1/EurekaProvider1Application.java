package com.example.eurekaprovider1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProvider1Application {
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "Hello world"+port;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider1Application.class, args);
    }

}
