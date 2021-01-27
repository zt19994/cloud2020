package com.learn.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * zk注册订单
 *
 * @author zt1994
 * @date 2021/1/27 20:43
 */
@RestController
@Slf4j
public class OrderZKController {


    public static final String INVOK_URl = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    /**
     * 从zk获取payment信息
     *
     * @return
     */
    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOK_URl + "/payment/zk", String.class);
    }
}
