package com.loving.config;

import com.ribbonconfig.GlobalRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;



@Configuration
/**
 * 自定义模块调用负载均衡策略
 * 推荐配置文件方式
 */
/*@RibbonClients(value = {
        @RibbonClient(name = "product-center",configuration = ProductCenterRibbonConfig.class),
        @RibbonClient(name = "pay-center",configuration = PayCenterRibbonConfig.class)
})*/


/**
 * 自定义负载均衡算法
 */
@RibbonClients(defaultConfiguration = GlobalRibbonConfig.class)
public class CustomerRibbonConfig {
}
