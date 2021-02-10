package com.loving.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 降级策略
 * @Author: yijunjun
 * @Date: 2021/2/10 22:27
 */
@RestController
@Slf4j
public class DeGradeDemoController {

    /**
     * 请求超过设定的时间，触发降级
     * 时间窗口可设置恢复降级的时间
     */
    @RequestMapping("/testRt")
    public String testRTDeGrade() {
        log.info("rt 降级策略");
        return "rt";
    }

    /**
     * 请求超过设定的异常比例，触发降级
     * 时间窗口可设置恢复降级的时间
     */
    @RequestMapping("/testExProp")
    public String testExceptionProportion() {
        log.info("异常比例");
        //numA[0-3]
        Integer numA = new Random().nextInt(4);
        //请求十次概率>1的概率是75%
        if(numA>1){
            log.info("会抛出异常");
            throw new RuntimeException("throw  exception");
        }
        return "testExProp";
    }

    /**
     * 1分钟内，请求异常数超过设定的阈值，触发降级
     * 时间窗口最好设置大于1分钟
     */
    @RequestMapping("/testExCount")
    public String testExCount() {
        log.info("异常数");
        //numA[0-3]
        Integer numA = new Random().nextInt(4);
        //请求十次概率>1的概率是75%
        if(numA>1){
            log.info("会抛出异常");
            throw new RuntimeException("throw  exception");
        }
        return "testExCount";
    }
}
