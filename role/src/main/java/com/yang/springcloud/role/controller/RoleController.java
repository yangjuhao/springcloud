package com.yang.springcloud.role.controller;

import com.yang.springcloud.role.lb.LoadBalanced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/7
 * @Time: 9:31
 * @Description:
 */
@RestController
public class RoleController {

    public static final String URL = "http://USER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalanced loadBalanced;

    @GetMapping(value = "/role")
    public String role(){
        String forObject = restTemplate.getForObject(URL + "/user", String.class);
        return forObject.toString();
    }

    @GetMapping(value = "/role/lb")
    public String roleLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("USER-SERVICE");
        if(CollectionUtils.isEmpty(instances)){
            return null;
        }
        ServiceInstance serviceInstance = loadBalanced.instance(instances);
        return restTemplate.getForObject(serviceInstance.getUri() + "user",String.class);
    }

}
