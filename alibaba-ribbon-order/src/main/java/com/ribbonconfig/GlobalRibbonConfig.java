package com.ribbonconfig;

import com.loving.alibabaribbonorder.myrule.WeightedRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局ribbon 配置
 * @Author: yijunjun
 * @Date: 2021/1/9 16:18
 */
@Configuration
public class GlobalRibbonConfig {

    @Bean
    public IRule theSameClusterPriorityRule(){
        //权重
        return new WeightedRule();
    }
}
