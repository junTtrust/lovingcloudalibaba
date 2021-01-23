package com.loving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//添加feign 注解
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaFeignOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaFeignOrderApplication.class, args);
    }

}
