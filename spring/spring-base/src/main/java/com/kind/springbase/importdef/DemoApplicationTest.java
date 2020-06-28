package com.kind.springbase.importdef;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhoujifeng
 * @date 2020/6/28 8:41 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {HelloConfiguration.class})
public class DemoApplicationTest {

    @Resource
    HelloService helloService;

    @Test
    public void contextLoads(){
        System.out.println("hello:" + helloService.getClass());
    }
}
