package com.yang.springcloud.role;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 17:10
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
// @EnableCircuitBreaker
@EnableHystrix
public class RoleHystrixApp {

    public static void main(String[] args) {
        System.out.println("角色-Hystrix服务启动。。。。");
        SpringApplication.run(RoleHystrixApp.class,args);
        System.out.println("角色-Hystrix服务启动成功");
    }
}
