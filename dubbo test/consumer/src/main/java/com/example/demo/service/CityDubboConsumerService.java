package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.User;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 * Created by Jaycekon on 20/09/2017.
 */
@Component
public class CityDubboConsumerService {

    @Reference
    UserService userService;


    public User saveUser() {
        return userService.getUser();
    }
}
