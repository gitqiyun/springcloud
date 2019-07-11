package com.example.feignconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiyun
 * @date 2019/7/8
 * @描述
 */
@FeignClient("eureka-provider")
public interface HomeClient {
    @GetMapping("/")
    String consumer();
}
