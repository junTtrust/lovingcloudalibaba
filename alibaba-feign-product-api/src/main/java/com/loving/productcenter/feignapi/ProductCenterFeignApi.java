package com.loving.productcenter.feignapi;

import com.loving.config.ProductCenterFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yijunjun
 * @Date: 2021/1/23 11:36
 */

//通过java配置版本来指定细粒度配置
@FeignClient(name = "product-center",configuration = ProductCenterFeignConfig.class)
//@FeignClient(name = "product-center")
public interface ProductCenterFeignApi {

    /**
     * 声明式接口，远程调用http://product-center/selectProductInfoById/{productNo}
     */

    @RequestMapping("/selectProductInfoById/{productNo}")
    public String selectProductInfoById(@PathVariable("productNo") String productNo);

    /**
     * 修改契约feign，默认注解
     * @param productNo
     * @return
     */
//    @RequestLine("GET /selectProductInfoById/{productNo}")
//    String selectProductInfoById(@Param("productNo") String productNo);

    @RequestMapping("/getToken4Header")
    public String getToken4Header(@RequestHeader("token") String token);
}
