package com.loving.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.loving.handler.GlobalExceptionHandler;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    @Bean
    @LoadBalanced
    @SentinelRestTemplate(
            blockHandler = "handleException",blockHandlerClass = GlobalExceptionHandler.class,
            fallback = "fallback",fallbackClass = GlobalExceptionHandler.class

    )
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
