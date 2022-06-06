package com.yang.springcloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/19
 * @Time: 19:43
 * @Description:
 */
@Configuration
public class GateWayConfig {


    //@Bean
    //public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
    //    return routeLocatorBuilder.routes()
    //            .route("user-1",p ->
    //                p.path("/user1/**")
    //                 // .filters(f -> f.stripPrefix(1)) // 过滤前缀
    //                 .uri("http://127.0.0.1:8001")
    //            )
    //            .route("user-2",p ->
    //                p.path("/user/**/**")
    //                 // .filters(f -> f.stripPrefix(1)) // 过滤前缀
    //                 .uri("http://127.0.0.1:8001")
    //            )
    //            .build();
    //}
}
