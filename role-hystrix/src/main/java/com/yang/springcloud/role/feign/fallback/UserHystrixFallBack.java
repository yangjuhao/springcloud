package com.yang.springcloud.role.feign.fallback;

import com.yang.springcloud.role.feign.UserHystrixFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/12
 * @Time: 20:25
 * @Description:
 */
@Component
@Slf4j
public class UserHystrixFallBack implements UserHystrixFeignApi {


    @Override
    public String succeed(Integer id) {
        log.info("succeed失败");
        return "succeed失败";
    }

    @Override
    public String timeOut(Integer id) {
        log.info("timeOut失败");
        return "timeOut失败";
    }
}
