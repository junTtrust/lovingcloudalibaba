package com.loving.alibabafeignproductapi.productcenter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yijunjun
 * @Date: 2021/1/23 11:36
 */
@FeignClient(name = "product-center")
public interface ProductCenterFeignApi {

    /**
     * 声明式接口，远程调用http://product-center/selectProductInfoById/{productNo}
     */

    @RequestMapping("/selectProductInfoById/{productNo}")
    public String selectProductInfoById(@PathVariable("productNo") String productNo);
}
