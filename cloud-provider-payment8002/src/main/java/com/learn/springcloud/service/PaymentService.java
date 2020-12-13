package com.learn.springcloud.service;

import com.learn.springcloud.entities.Payment;

/**
 * 支付订单service
 *
 * @author zt1994
 * @date 2020/12/13 16:02
 */
public interface PaymentService {

    /**
     * 添加支付订单
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询订单
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
