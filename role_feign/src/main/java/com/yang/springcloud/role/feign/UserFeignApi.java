package com.yang.springcloud.role.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 14:29
 * @Description:
 */
@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignApi {

    @GetMapping(value = "/user")
    String user();

    @GetMapping(value = "/user/feign/timeOut")
    public String feignTimeOut();
}
