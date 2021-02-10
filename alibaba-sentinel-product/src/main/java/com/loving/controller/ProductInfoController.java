package com.loving.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yijunjun
 * @Date: 2021/2/10 16:15
 */
@RestController
public class ProductInfoController {
    @RequestMapping("/selectProductInfoById/{productNo}")
    public String selectProductInfoById(@PathVariable("productNo") String productNo) {
       return productNo;
    }
}
