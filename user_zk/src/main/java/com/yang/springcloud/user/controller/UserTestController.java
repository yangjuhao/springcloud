package com.yang.springcloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/4/29
 * @Time: 17:07
 * @Description:
 */
@RestController
public class UserTestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/user/zk")
    public String test(){
        return port +":"+UUID.randomUUID().toString();
    }

}
