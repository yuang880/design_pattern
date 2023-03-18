package com.zhangxd.demo.design.mq;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PopOrderDelivered {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private Date sku;

    /**
     * 商品名称
     */
    private Date skuName;

    /**
     * 金额
     */
    private BigDecimal decimal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
