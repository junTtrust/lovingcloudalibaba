package com.loving.alibabaribbonorder.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate( ) {
        return new RestTemplate();
    }


    /**
     * 随机算法
     */
   /* public IRule randomRule(){
        return new RandomRule();
    }*/
}
