package com.yang.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/17
 * @Time: 16:37
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApp {

    public static void main(String[] args) {
        System.out.println("开始启动网关服务");
        SpringApplication.run(GatewayApp.class,args);
        System.out.println("网关服务启动成功");
    }
}
