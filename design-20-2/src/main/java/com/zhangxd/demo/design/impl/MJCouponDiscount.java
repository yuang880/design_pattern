package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.CouponDiscountService;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
public class MJCouponDiscount implements CouponDiscountService<Map<String, String>> {

    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("n");

        // 小于商品金额条件的，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }
        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }
}
