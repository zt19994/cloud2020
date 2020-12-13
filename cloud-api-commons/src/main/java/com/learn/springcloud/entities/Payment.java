package com.learn.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付订单实体类
 *
 * @author zt1994
 * @date 2020/12/13 15:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 订单id
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;
}
