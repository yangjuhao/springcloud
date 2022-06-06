package com.yang.srpingcloud.user2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/7
 * @Time: 9:13
 * @Description:
 */
@RestController
@RequestMapping("/user1")
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/get")
    public String get(){
        return "user2:"+port;
    }

    @GetMapping(value = "/get1")
    public String get1(String user){
        return "get1:"+user;
    }

    @PostMapping(value = "/get2")
    public String get2(String user){
        return "get2:"+user;
    }

    @PutMapping(value = "/get3")
    public String get3(String user){
        return "get3:"+user;
    }

    @GetMapping(value = "/header")
    public String header(@RequestHeader("X-Request-Id") String header){
        return "header:"+header;
    }

}
