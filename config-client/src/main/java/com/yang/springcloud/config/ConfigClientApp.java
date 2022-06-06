package com.yang.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/6/6
 * @Time: 15:38
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApp {

    public static void main(String[] args) {
        System.out.println("配置客户端开始启动。。。");
        SpringApplication.run(ConfigClientApp.class,args);
        System.out.println("配置客户端启动成功。。。");
    }

}
