package com.loving.alibabaribbonproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaRibbonProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaRibbonProductApplication.class, args);
    }

}
