package com.example.customeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient      //开启发现服务功能
@SpringBootApplication
public class CustomerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerUserApplication.class, args);
    }

    @LoadBalanced //开启负载均衡
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
