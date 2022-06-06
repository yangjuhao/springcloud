package com.yang.springcloud.role;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/7
 * @Time: 9:29
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class RoleApp {

    public static void main(String[] args) {
        System.out.println("启动角色服务。。。");
        SpringApplication.run(RoleApp.class,args);
        System.out.println("角色服务启动成功！！！");
    }

}
