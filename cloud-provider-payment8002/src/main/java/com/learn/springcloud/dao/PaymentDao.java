package com.learn.springcloud.dao;

import com.learn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 支付订单dao
 *
 * @author zt1994
 * @date 2020/12/13 15:48
 */
@Mapper
public interface PaymentDao {

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
    Payment getPaymentById(@Param("id") Long id);
}
