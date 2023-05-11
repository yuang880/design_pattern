package com.zhangxd.demo.design;

import java.math.BigDecimal;

/**
 * @author zhangxd
 * @version 1.0 2023/5/8
 */
public class Context<T> {

    private CouponDiscountService<T> service;

    public Context(CouponDiscountService<T> service) {
        this.service = service;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return service.discountAmount(couponInfo, skuPrice);
    }

}
