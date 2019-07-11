package feignhystrixdashboard;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiyun
 * @date 2019/7/8
 * @描述
 */
@FeignClient(value = "eureka-provider" ,fallbackFactory = HystrixClientFallbackFactory.class)
public interface HomeClient {
    @GetMapping("/")
    String consumer();
}
