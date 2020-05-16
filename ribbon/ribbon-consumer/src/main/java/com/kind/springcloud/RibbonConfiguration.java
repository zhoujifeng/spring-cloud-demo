package com.kind.springcloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoujifeng
 * @date 2020/5/16 5:29 下午
 */
@Configuration
@RibbonClient(name = "eureka-client",configuration = com.netflix.loadbalancer.RandomRule.class)
public class RibbonConfiguration {

//    @Bean
//    public IRule defaultLBStrategy(){
//
//        return new RandomRule();
//
//    }
}
