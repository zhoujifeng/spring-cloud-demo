package com.kind.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;

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
        Friend friend = new Friend();
        friend.setName("zhoujf");
        return service.sayHi();
    }


    @GetMapping("/balance")
    public String balance(){
        Friend friend = new Friend();
        friend.setName("zhoujf");
        return service.balance();
    }

    @PostMapping("/posttest")
    public String postTest(@RequestBody PostParam postParam){
        Friend friend = new Friend();
        friend.setName("zhoujf");
        long count = postParam.getCount();
        for(int i=0;i<count;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //long start = System.currentTimeMillis();
                    service.postTest(friend);
                    //long end = System.currentTimeMillis();
                    //System.out.println((end-start));

                }
            }).start();

        }
        return null;
    }


    @PostMapping("/postTestRes")
    public Friend postTestRes(){
        Friend friend = new Friend();
        friend.setName("zhoujf");
        Friend friend1 = service.postTestRes(friend);
        return friend1;
    }
}
