package com.loving.controller;

import com.loving.productcenter.feignapi.ProductCenterFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: yijunjun
 * @Date: 2021/2/10 16:10
 */
@RestController
@Slf4j
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


    /*--------------------------开始-----------------模拟 当saveorder接口访问达到上限，限制findById接口---------------*/
    /**
     * 方法实现说明:模仿  流控模式【关联】  读接口
     * @author:smlz
     * @param orderNo
     * @return:
     * @exception:
     * @date:2019/11/24 22:06
     */
    @RequestMapping("/findById/{orderNo}")
    public String findById(@PathVariable("orderNo") String orderNo) {
        log.info("orderNo:{}","执行查询操作");
        return orderNo;
    }

    /**
     * 方法实现说明:模仿流控模式【关联】   写接口(优先)
     * @author:smlz
     * @return:
     * @exception:
     * @date:2019/11/24 22:07
     */
    @RequestMapping("/saveOrder")
    public String saveOrder() {
        log.info("执行保存操作,模仿返回订单ID");
        return UUID.randomUUID().toString();
    }

    /*--------------------------結束-----------------模拟 当saveorder接口访问达到上限，限制findById接口---------------*/


    /**
     * 流控效果【排队等待】
     * 限制每秒通过的请求数量，其余请求在请求外等待，如果超时则舍弃
     * @return:
     * @throws InterruptedException
     */
    @RequestMapping("/findAll")
    public String findAll() throws InterruptedException {
        Thread.sleep(2000);
        return "findAll";
    }
}
