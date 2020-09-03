package com.cykj.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {


//    //加载到容器里，实现负载均衡
//    @LoadBalanced
//    @Bean
//    public RestTemplate restTemplate()
//    {
//        return new RestTemplate();
//    }


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
