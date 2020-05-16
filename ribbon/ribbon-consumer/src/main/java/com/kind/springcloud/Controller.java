package com.kind.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujifeng
 * @date 2020/5/16 4:55 下午
 */
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayHi")
    public String sayHi(){

        return restTemplate.getForObject("http://eureka-client/sayHi",String.class);

    }
}
