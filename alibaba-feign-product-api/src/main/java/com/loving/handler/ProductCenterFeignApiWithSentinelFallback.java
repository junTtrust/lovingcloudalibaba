package com.loving.handler;

import com.loving.productcenter.sentinel.ProductCenterFeignApiWithSentinel;
import org.springframework.stereotype.Component;

@Component
public class ProductCenterFeignApiWithSentinelFallback implements ProductCenterFeignApiWithSentinel {
    @Override
    public String selectProductInfoByIdForSentinel(String productNo) {
        return "默认商品";
    }
}
