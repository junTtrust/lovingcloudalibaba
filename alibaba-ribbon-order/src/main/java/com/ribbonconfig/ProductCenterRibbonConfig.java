package com.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * product 工程ribbon 负载均衡策略
 * @Author: yijunjun
 * @Date: 2021/1/9 11:23
 */
@Configuration
public class ProductCenterRibbonConfig {

    /**
     * 随机策略
     */
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
