package com.cloud.alibaba.alibabaribbonpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaRibbonPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaRibbonPayApplication.class, args);
    }

}
