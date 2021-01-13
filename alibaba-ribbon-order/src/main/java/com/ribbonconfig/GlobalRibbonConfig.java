package com.ribbonconfig;

import com.loving.alibabaribbonorder.myrule.TheSameClusterPriorityRule;
import com.loving.alibabaribbonorder.myrule.TheSameClusterPriorityWithVersionRule;
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
        //return new WeightedRule();
        //同集群优先调用
//        return new TheSameClusterPriorityRule();
        //金丝雀发布：同集群同版本优先调用
        return new TheSameClusterPriorityWithVersionRule();
    }
}
