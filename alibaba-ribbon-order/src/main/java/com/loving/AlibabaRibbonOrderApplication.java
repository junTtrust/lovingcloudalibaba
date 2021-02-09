package com.loving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaRibbonOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaRibbonOrderApplication.class, args);
    }

}
