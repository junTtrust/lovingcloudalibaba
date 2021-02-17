package com.loving.compent.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 单个微服务过滤器
 * 功能：实现统计每个接口调用时间
 * @Author: yijunjun
 * @Date: 2021/2/17 17:42
 */
@Component
@Slf4j
public class TimeMonitorGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {

    private static final String COUNT_START_TIME = "countStartTime";

    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return new TimeMonitorGatewayFilter(config);
    }

    /**
     * 当存在多个过滤器时
     * 我们自己写一个静态内部类 实现GatewayFilter,Ordered  通过Orderd可以实现顺序的控制
     */
    public static class TimeMonitorGatewayFilter implements GatewayFilter, Ordered{
        private NameValueConfig nameValueConfig;

        public TimeMonitorGatewayFilter(NameValueConfig nameValueConfig) {
            this.nameValueConfig = nameValueConfig;
        }

        @Override
        public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
            String name = nameValueConfig.getName();
            String value = nameValueConfig.getValue();
            log.info("name:{},value:{}",name,value);
            if(value.equals("false")){
                return null;
            }
            exchange.getAttributes().put(COUNT_START_TIME,System.currentTimeMillis());

            return chain.filter(exchange).then(Mono.fromRunnable(new Runnable() {
                @Override
                public void run() {
                    Long startTime = exchange.getAttribute(COUNT_START_TIME);
                    if(startTime != null){
                        StringBuilder sb = new StringBuilder(exchange.getRequest().getURI().getRawPath())
                                .append(":")
                                .append(System.currentTimeMillis() - startTime)
                                .append("ms");
                        sb.append(" params:").append(exchange.getRequest().getQueryParams());
                        log.info(sb.toString());
                    }
                }
            }));
        }

        //值越小越优先执行
        @Override
        public int getOrder() {
            return -100;
        }
    }
}
