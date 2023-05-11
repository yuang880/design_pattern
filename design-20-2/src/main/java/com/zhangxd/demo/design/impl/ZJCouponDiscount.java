package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.CouponDiscountService;

import java.math.BigDecimal;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
public class ZJCouponDiscount implements CouponDiscountService<Double> {

    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(BigDecimal.valueOf(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
