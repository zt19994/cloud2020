package com.learn.springcloud.controller;

import com.learn.springcloud.service.PaymentService;
import com.learn.springcloud.entities.CommonResult;
import com.learn.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 支付订单controller
 *
 * @author zt1994
 * @date 2020/12/13 16:06
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 新增支付订单
     *
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);

        if (result > 0) {
            return new CommonResult<>(200, "success serverPort:" + serverPort, result);
        }
        return new CommonResult<>(444, "fail serverPort:" + serverPort, null);
    }


    /**
     * 根据id查询支付订单
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果：" + result);

        if (result != null) {
            return new CommonResult<>(200, "success serverPort:" + serverPort, result);
        }
        return new CommonResult<>(444, "无对应结果 serverPort: " + id + " " + serverPort, null);
    }

}
