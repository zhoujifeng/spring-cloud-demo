package com.kind.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhoujifeng
 * @date 2020/5/29 9:19 下午
 */
@SpringBootApplication(scanBasePackages = {"com.kind.springcloud", "feign"})
@EnableDiscoveryClient
@EnableFeignClients
public class FeignConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
