package feignhystrixdashboard;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiyun
 * @date 2019/7/8
 * @描述
 */
@RestController
public class ConsumerController {
    @Autowired
    private HomeClient homeClient;
    @GetMapping(value = "/hello")
    public String hello() {
        return  homeClient.consumer();
    }
}
