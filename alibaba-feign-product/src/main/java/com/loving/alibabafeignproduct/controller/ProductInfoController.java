package com.loving.alibabafeignproduct.controller;

import com.loving.alibabafeignproductapi.productcenter.ProductCenterFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smlz on 2019/11/17.
 */
@RestController
@Slf4j
// 实现 ProductCenterFeignApi 检查防止api 改动 实现未改
public class ProductInfoController implements ProductCenterFeignApi {



    @RequestMapping("/selectProductInfoById/{productNo}")
    public String selectProductInfoById(@PathVariable("productNo") String productNo)  {
        return productNo;
    }

    @RequestMapping("/getToken4Header")
    public String getToken4Header(@RequestHeader("token") String token)  {
        log.info("token:{}",token);
        return token;
    }
}
