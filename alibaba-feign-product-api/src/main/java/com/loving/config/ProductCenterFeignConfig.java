package com.loving.config;

import com.loving.handler.LovingRequestInterceptor;
import feign.Contract;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
/**
 * 这个类上千万不要添加@Configuration,不然会被作为全局配置文件共享
 * @Author: yijunjun
 * @Date: 2021/1/23 16:43
 */
public class ProductCenterFeignConfig {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
        //return Logger.Level.BASIC;
    }

    /**
     * 根据SpringBoot自动装配FeignClientsConfiguration 的FeignClient的契约是SpringMvc
     * ,通过修改契约为默认的Feign的锲约，那么就可以使用默认的注解
     */
//    public Contract feiContract(){
//        return new Contract.Default();
//    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new LovingRequestInterceptor();
    }
}
