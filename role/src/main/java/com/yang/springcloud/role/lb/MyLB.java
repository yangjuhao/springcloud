package com.yang.springcloud.role.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 手写负载均衡
 * @Author: Yang.JuHao
 * @Date: 2022/5/11
 * @Time: 10:35
 * @Description:
 */
@Component
public class MyLB implements LoadBalanced{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 手写轮询
     * @return
     */
    private Integer getAndIncrement(){
        // 当前次数
        int current;
        // 下一次次数
        int next;
        do{
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE?0:current+1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("请求次数，next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstance) {
        // int index =  getAndIncrement() % serviceInstance.size();
        int index = random(serviceInstance.size()) ;
        return serviceInstance.get(index);
    }


    /**
     * 随机轮询
     * @param size
     */
    private Integer random(int size) {
        Random random = new Random();
        int index = random.nextInt(size);
        return index;
    }

    public static void main(String[] args) {
        Integer size = 2;
        Random random = new Random();
        int index = random.nextInt(size);
        System.out.println(index);
    }
}
