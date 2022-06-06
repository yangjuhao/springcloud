package com.yang.srpingcloud.user2.controller;

import com.yang.srpingcloud.user2.service.UserHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 17:26
 * @Description:
 */
@RestController
public class UserHystrixController {

    @Autowired
    private UserHystrixService userHystrixService;


    @GetMapping(value = "/user/ok/{id}")
    public String succeed(@PathVariable("id") Integer id){
        return userHystrixService.succeed(id);
    }

    @GetMapping(value = "/user/timeOut/{id}")
    public String timeOut(@PathVariable("id") Integer id){
        return userHystrixService.timeOut(id);
    }


    // 服务熔断
    @GetMapping(value = "/user/fusing/{id}")
    public String userFusing(@PathVariable("id") Integer id){
        return userHystrixService.userFusing(id);
    }

}
