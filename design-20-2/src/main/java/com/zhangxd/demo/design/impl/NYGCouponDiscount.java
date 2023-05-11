package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.CouponDiscountService;

import java.math.BigDecimal;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
public class NYGCouponDiscount implements CouponDiscountService<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return BigDecimal.valueOf(couponInfo);
    }
}
