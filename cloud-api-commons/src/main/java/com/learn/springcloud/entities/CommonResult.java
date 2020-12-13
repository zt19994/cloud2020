package com.learn.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回类
 *
 * @author zt1994
 * @date 2020/12/13 15:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * message 消息
     */
    private String message;

    /**
     * 返回data
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
