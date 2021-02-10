package com.loving.controller;

import com.loving.productcenter.feignapi.ProductCenterFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yijunjun
 * @Date: 2021/2/10 16:10
 */
@RestController
public class OrderInfoController {

    @Autowired
    private ProductCenterFeignApi productCenterFeignApi;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo) {
        String result = productCenterFeignApi.selectProductInfoById(orderNo);
        if (result == null) {
            return "没有对应的商品";
        }
        return result;
    }
}
