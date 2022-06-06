package com.yang.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/6/6
 * @Time: 15:41
 * @Description:
 */
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/get")
    public String getConfigInfo(){
        return configInfo;
    }

}
