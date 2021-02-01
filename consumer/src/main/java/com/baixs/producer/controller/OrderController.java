package com.baixs.producer.controller;

import com.baixs.api.UserService;
import com.baixs.api.entity.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @DubboReference
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        //调用服务
        User user = userService.findUserById(id);
        return user;
    }
}
