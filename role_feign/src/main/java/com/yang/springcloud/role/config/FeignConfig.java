package com.yang.springcloud.role.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 15:26
 * @Description:
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }

}