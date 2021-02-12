package com.loving.handler;

import com.loving.productcenter.sentinel.ProductCenterFeignApiWithSentinel;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/11/28.
 */
@Component
public class ProductCenterFeignApiWithSentielFallbackFactory implements FallbackFactory<ProductCenterFeignApiWithSentinel> {
    @Override
    public ProductCenterFeignApiWithSentinel create(Throwable throwable) {
        return new ProductCenterFeignApiWithSentinel(){
            @Override
            public String selectProductInfoByIdForSentinel(String productNo) {
                return throwable.getMessage();
            }
        };
    }
}
