package com.loving.controller;

import org.springframework.web.client.RestTemplate;

public class TestSentinelRule {

    public static void main(String[] args) throws InterruptedException {
       /* //流控模式【关联】
      RestTemplate restTemplate = new RestTemplate();

        for(int i=0;i<1000;i++) {
            restTemplate.postForObject("http://localhost:8080/saveOrder",null,String.class);
            Thread.sleep(200);
        }
*/
        //流控效果【排队等待】
        testWaiting();
    }

    //流控效果【排队等待】
    public static void testWaiting() {
        RestTemplate restTemplate = new RestTemplate();
        for(int i=0;i<1000;i++) {
            restTemplate.postForObject("http://localhost:8080/findAll",null,String.class);
//            System.out.println(new Date().getTime());
        }
    }
}
