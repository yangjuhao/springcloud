package com.yang.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/31
 * @Time: 19:14
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {

    public static void main(String[] args) {
        System.out.println("配置中心开始启动。。。");
        SpringApplication.run(ConfigServerApp.class,args);
        System.out.println("配置中心开始成功");
    }

}
