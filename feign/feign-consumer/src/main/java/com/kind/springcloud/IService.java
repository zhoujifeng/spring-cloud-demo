package com.kind.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhoujifeng
 * @date 2020/5/29 9:23 下午
 */
@FeignClient("eureka-client")
public interface IService {

    @GetMapping("/sayHi")
    public String sayHi();
}
