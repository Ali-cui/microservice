package com.srcb.son;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Ali.cui
 * @Date: 2020/10/28 14:26
 */
@Configuration
public class RestTemplateBean {
    @Bean//通过Ribbon实现客户端负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
