package com.example.feignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qiyun
 * @date 2019/7/9
 * @描述
 */
@EnableFeignClients
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class FeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }
}
