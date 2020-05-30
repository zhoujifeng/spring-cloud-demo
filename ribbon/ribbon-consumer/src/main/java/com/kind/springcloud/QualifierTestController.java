package com.kind.springcloud;

import com.kind.springcloud.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * 测试@Qualifier当作传送门
 * @author zhoujifeng
 * @date 2020/5/21 8:09 下午
 */
@RestController
public class QualifierTestController {

    @Autowired
    @Qualifier
    private List<User> users;

    @GetMapping("/list")
    public Object listusers(){
        return users;
    }
}
