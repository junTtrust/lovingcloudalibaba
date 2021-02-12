package com.loving.productcenter.sentinel;

import com.loving.handler.ProductCenterFeignApiWithSentielFallbackFactory;
import com.loving.handler.ProductCenterFeignApiWithSentinelFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yijunjun
 * @Date: 2021/2/12 15:11
 */

//@FeignClient(name = "product-center",fallback = ProductCenterFeignApiWithSentinelFallback.class)
@FeignClient(name = "product-center",fallbackFactory = ProductCenterFeignApiWithSentielFallbackFactory.class)
public interface ProductCenterFeignApiWithSentinel {

    @RequestMapping("/selectProductInfoByIdForSentinel/{productNo}")
    public String selectProductInfoByIdForSentinel(@PathVariable("productNo") String productNo);
}
