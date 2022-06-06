package com.yang.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/4/29
 * @Time: 15:15
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka02App {

    public static void main(String[] args) {
        System.out.println("开始启动Eureka02服务");
        SpringApplication.run(Eureka02App.class,args);
        System.out.println("Eureka02服务启动成功");
    }

}
