package com.baixs.producer.service;

import com.baixs.api.UserService;
import com.baixs.api.entity.User;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements UserService {

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("abc");
        user.setPassword("123");
        user.setTel("13102587461");
        user.setAddress("贵州省贵阳市云岩区水东路xx号");
        return user;
    }
}
