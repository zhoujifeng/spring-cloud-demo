package com.kind.springcloud.user;

import java.io.Serializable;

/**
 * @author zhoujifeng
 * @date 2020/5/21 8:14 下午
 */
public class User implements Serializable {

    private int id;

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
