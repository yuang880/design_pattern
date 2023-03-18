package com.zhangxd.demo.design.mq;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderMq {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 商品
     */
    private String sku;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date createOrderTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
