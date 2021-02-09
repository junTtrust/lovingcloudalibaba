package com.loving.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class PayInfoController {



    @RequestMapping("/selectPayInfoByOrderNo/{orderNo}")
    public Object selectPayInfoByOrderNo(@PathVariable("orderNo") String orderNo) {
        log.info("--------------payinfobyorderno=-----------{}",orderNo);
        if("1".equals(orderNo)){
            return "订单号为"+ orderNo;
        }
        return orderNo;
    }
}
