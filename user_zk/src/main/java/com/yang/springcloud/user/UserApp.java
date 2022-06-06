package com.yang.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/4/29
 * @Time: 15:25
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApp {

    public static void main(String[] args) {
        System.out.println("开始启动用户ZK服务");
        SpringApplication.run(UserApp.class,args);
        System.out.println("用户ZK服务启动成功");
    }
}
