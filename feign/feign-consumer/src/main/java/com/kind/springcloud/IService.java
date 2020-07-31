package com.kind.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhoujifeng
 * @date 2020/5/29 9:23 下午
 */
@FeignClient(value = "eureka-client",url = "http://localhost:20003")
public interface IService {

    @GetMapping("/v1/card/sayHi")
    public String sayHi();

    @RequestMapping(value = "/balance",method = RequestMethod.POST)
    public String balance();

    @RequestMapping(value = "/v1/card/posttest",method = RequestMethod.POST)
    public String postTest(Friend friend);


    @RequestMapping(value = "/v1/card/postTestRes",method = RequestMethod.POST)
    public Friend postTestRes(Friend friend);

}
