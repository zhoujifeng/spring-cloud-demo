package com.kind.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoujifeng
 * @date 2020/4/27 10:11 下午
 */
@RestController
@Slf4j
@RequestMapping("/v1/card")
public class Controller {



    @Value("${server.port}")
    private String port;


    @GetMapping("/sayHi")
    public String sayHi(){
        return "this is " + port;
    }

    @RequestMapping(value = "/balance",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String info(){
        return "this is info " + port;
    }

    @PostMapping("/sayHi")
    public Friend sayHiPost(@RequestBody Friend friend){

        log.info("You are " + friend.getName());
        friend.setPort(port);
        return friend;

    }



    @PostMapping("/posttest")
    public Friend postTest(@RequestBody Friend friend){

        log.info("You are " + friend.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        friend.setPort(port);
        return friend;

    }

    @PostMapping("/postTestRes")
    public Friend postTestRes(@RequestBody Friend friend){

        log.info("You are " + friend.getName());
        friend.setPort(port);
        return friend;

    }

}
