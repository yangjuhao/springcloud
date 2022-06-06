package com.yang.springcloud.hystrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/16
 * @Time: 15:33
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启图形化监视
public class HystrixDashboardApp {

    public static void main(String[] args) {
        System.out.println("启动Hystrix图形化监视。。。");
        SpringApplication.run(HystrixDashboardApp.class,args);
        System.out.println("Hystrix图形化监视启动成功！！！");
    }

}
