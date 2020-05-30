package com.kind.springcloud.user;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoujifeng
 * @date 2020/5/21 8:10 下午
 */
@Configuration
public class Config {

    @Bean
    @Qualifier
    public User user1(){
        return new User(1,"zhoujifeng1");
    }

    @Bean
    public User user2(){
        return new User(2,"zhoujifeng2");
    }
}
