package com.zhangxd.demo.design.coupon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhangxd
 * @version 1.0 2023/2/19
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CouponResult {

    /**
     * 优惠券编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
