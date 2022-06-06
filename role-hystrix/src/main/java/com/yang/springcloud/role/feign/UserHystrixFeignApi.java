package com.yang.springcloud.role.feign;

import com.yang.springcloud.role.feign.fallback.UserHystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 14:29
 * @Description:
 */
@Component
@FeignClient(value = "USER-SERVICE",fallback = UserHystrixFallBack.class)
public interface UserHystrixFeignApi {

    @GetMapping(value = "/user/ok/{id}")
    public String succeed(@PathVariable("id") Integer id);

    @GetMapping(value = "/user/timeOut/{id}")
    public String timeOut(@PathVariable("id") Integer id);
}
