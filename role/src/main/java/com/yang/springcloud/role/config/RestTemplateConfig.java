package com.yang.springcloud.role.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/7
 * @Time: 9:36
 * @Description:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    // @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
