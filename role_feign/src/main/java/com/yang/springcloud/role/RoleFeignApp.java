package com.yang.springcloud.role;

import com.yang.springcloud.balance.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 14:26
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
// @RibbonClient(value = "USER-SERVICE",configuration = MySelfRule.class)
public class RoleFeignApp {

    public static void main(String[] args) {
        System.out.println("启动角色服务。。。");
        SpringApplication.run(RoleFeignApp.class,args);
        System.out.println("角色服务启动成功！！！");
    }
}
