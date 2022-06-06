package com.yang.springcloud.role.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 10:34
 * @Description:
 */
public interface LoadBalanced {

    ServiceInstance instance(List<ServiceInstance> serviceInstance);
}
