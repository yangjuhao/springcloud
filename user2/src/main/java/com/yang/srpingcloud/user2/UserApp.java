package com.yang.srpingcloud.user2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/4/29
 * @Time: 15:25
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApp {

    public static void main(String[] args) {
        System.out.println("开始启动用户服务");
        SpringApplication.run(UserApp.class,args);
        System.out.println("用户服务启动成功");
    }
}
