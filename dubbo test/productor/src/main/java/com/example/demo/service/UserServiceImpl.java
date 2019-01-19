package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.User;
import org.springframework.stereotype.Component;


import java.util.UUID;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("dajitui");
        return user;
    }
}
