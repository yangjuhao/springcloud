package com.yang.springcloud.role.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yang.springcloud.role.feign.UserHystrixFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class OrderController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private UserHystrixFeignApi userHystrixFeignApi;


    @GetMapping(value = "/role/ok/{id}")
    public String succeed(@PathVariable("id") Integer id){
        return userHystrixFeignApi.succeed(id);
    }


    @GetMapping(value = "/role/timeOut/{id}")
    public String timeOut(@PathVariable("id") Integer id){
        Long st = System.currentTimeMillis();
        String service = userHystrixFeignApi.timeOut(id);
        Long end = System.currentTimeMillis();
        return service + "耗时："+(end-st);
    }



}
