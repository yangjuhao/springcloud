package com.yang.srpingcloud.user2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 17:25
 * @Description:
 */
@Service
@Slf4j
public class UserHystrixService {

    @Value("${server.port}")
    private String port;

    int count;

    public String succeed(Integer id){
        // int i = 10/0;
        String threadName = Thread.currentThread().getName();
        return "线程："+ threadName +" 端口:"+ port +":"+ id;
    }

    /**
     * 在服务端接口上加上该注解，运行报错或超时就会降级
     * @fallbackMethod 兜底的方法
     * @param id
     * @return
     */
    /*@HystrixCommand(fallbackMethod = "timeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })*/
    public String timeOut(Integer id){
        // 运行报错
        // int i = 10/0;
        // 超时
        int time = 5;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName +"::"+ count++);
        return "线程："+ threadName +" 端口:"+ port +":"+ id + " 超时(秒):"+time;
    }

    public String timeOutHandler(Integer id){
        return "用户服务:"+port+"超时了";
    }



    // 服务熔断
    @HystrixCommand(fallbackMethod = "userFusingHandler",
            commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 多久时间内
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), // 错误率
    })
    public String userFusing(Integer id){
        if(id<0){
            throw new RuntimeException("id不能为负数");
        }
        return "成功，id为正数.流水号" + UUID.randomUUID();
    }

    private String userFusingHandler(Integer id){
        return "错误过多，服务熔断了";
    }
}
