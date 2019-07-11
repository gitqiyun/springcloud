package com.example.eurekacoustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiyun
 * @date 2019/7/8
 * @描述 调用提供者的 `home` 方法
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://eureka-provider/", String.class).getBody();
    }
}