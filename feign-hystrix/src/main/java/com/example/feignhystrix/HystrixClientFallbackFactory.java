package com.example.feignhystrix;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author qiyun
 * @date 2019/7/9
 * @描述
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClient> {
    @Override
    public HomeClient create(Throwable throwable) {
      return () -> "feign + hystrix ,提供者服务挂了";
    }
}
