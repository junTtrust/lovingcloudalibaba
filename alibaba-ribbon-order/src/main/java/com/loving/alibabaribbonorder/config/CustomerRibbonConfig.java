package com.loving.alibabaribbonorder.config;

import com.ribbonconfig.PayCenterRibbonConfig;
import com.ribbonconfig.ProductCenterRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;


/**
 * 自定义模块调用负载均衡策略
 * 推荐配置文件方式
 */
@Configuration
@RibbonClients(value = {
        @RibbonClient(name = "product-center",configuration = ProductCenterRibbonConfig.class),
        @RibbonClient(name = "pay-center",configuration = PayCenterRibbonConfig.class)
})
public class CustomerRibbonConfig {
}
