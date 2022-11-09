package com.yejinliang.it.config;

import com.yejinliang.it.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yejinliang
 * @create 2022-07-08 1:35
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced // RestTemplate开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
