package com.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * pay 工程ribbon 负载均衡策略
 * @Author: yijunjun
 * @Date: 2021/1/9 11:25
 */
@Configuration
public class PayCenterRibbonConfig {

    /**
     * 轮询策略
     */
    @Bean
    public IRule roundRobinRule(){
        return new RoundRobinRule();
    }
}
