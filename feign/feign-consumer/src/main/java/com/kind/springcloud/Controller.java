package com.kind.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujifeng
 * @date 2020/5/29 9:24 下午
 */
@RestController
public class Controller {

    @Autowired
    private IService service;


    @GetMapping("/sayHi")
    public String sayHi(){
        return service.sayHi();
    }
}
