package com.loving.alibabaribbonorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderInfoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public String selectOrderInfoById(@PathVariable("orderNo") String orderNo) {
        String forObject = null;
        try {
            forObject = restTemplate.getForObject("http://product-center/selectProductInfoById/" + orderNo, String.class);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return forObject;
    }

    @RequestMapping("/getOrderAndPayInfoByOrderNo/{orderNo}")
    public String getOrderAndPayInfoByOrderNo(@PathVariable("orderNo") String orderNo) {
        String forObject = null;
        try {
            forObject = restTemplate.getForObject("http://pay-center/selectPayInfoByOrderNo/"+orderNo, String.class);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return forObject;
    }
}
