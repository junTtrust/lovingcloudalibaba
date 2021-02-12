package com.loving.handler;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;

/**
 * @Author: yijunjun
 * @Date: 2021/2/12 12:05
 */
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 限流后处理方法
     * @param request
     * @param body
     * @param execution
     * @param ex
     * @return
     */
    public static SentinelClientHttpResponse handleException(HttpRequest request,
                                                             byte[] body, ClientHttpRequestExecution execution, BlockException ex)  {
        String str = "被限制流量拉";
        return new SentinelClientHttpResponse(str);
    }

    /**
     * 熔断后处理的方法
     * @param request
     * @param body
     * @param execution
     * @param ex
     * @return
     */
    public static SentinelClientHttpResponse fallback(HttpRequest request,
                                                      byte[] body, ClientHttpRequestExecution execution, BlockException ex) {
        String str = "被降级拉";
        return new SentinelClientHttpResponse(str);
    }
}
