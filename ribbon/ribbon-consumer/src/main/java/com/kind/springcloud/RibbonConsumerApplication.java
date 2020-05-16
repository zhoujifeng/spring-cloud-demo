package com.kind.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujifeng
 * @date 2020/4/27 10:09 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);

    }
}
