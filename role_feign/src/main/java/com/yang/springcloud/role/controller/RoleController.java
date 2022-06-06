package com.yang.springcloud.role.controller;


import com.yang.springcloud.role.feign.UserFeignApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/7
 * @Time: 9:31
 * @Description:
 */
@RestController
public class RoleController {

    @Resource
    private UserFeignApi userFeignApi;

    @GetMapping(value = "/roleFeign")
    public String roleFeign(){
        return userFeignApi.user();
    }

    @GetMapping(value = "/role/feign/timeOut")
    public String feignTimeOut(){
        return userFeignApi.feignTimeOut();
    }


}
