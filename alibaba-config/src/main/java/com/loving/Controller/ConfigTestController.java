package com.loving.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yijunjun
 * @Date: 2021/2/6 16:19
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigTestController {
    @Value("${isNewBusi}")
    private Boolean isNewBusi;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo) {
        if(isNewBusi) {
            return "查询订单执行新逻辑->execute new busi : "+orderNo;
        }
        return "查询订单执行老逻辑->execute old busi : "+orderNo;

    }
}
