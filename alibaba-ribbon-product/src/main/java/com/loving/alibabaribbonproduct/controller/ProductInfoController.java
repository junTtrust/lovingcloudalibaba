package com.loving.alibabaribbonproduct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductInfoController {


    @RequestMapping("/selectProductInfoById/{productNo}")
    public Object selectProductInfoById(@PathVariable("productNo") String productNo) {
        log.info("---------------productinfobyid----------------={}",productNo);
        if("1".equals(productNo)){
            return productNo;
        }
        return "false";
    }
}
