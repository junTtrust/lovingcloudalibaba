package com.loving.controller;

import com.loving.alibabafeignproductapi.productcenter.ProductCenterFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yijunjun
 * @Date: 2021/1/23 10:26
 */
@RestController
public class OrderInfoController {

    @Autowired
    private ProductCenterFeignApi productCenterFeignApi;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public String selectOrderInfoById(@PathVariable("orderNo") String orderNo) {
        String s = productCenterFeignApi.selectProductInfoById(orderNo);
        return s;
    }

}
