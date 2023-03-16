package com.zhangxd.demo.design.coupon;

/**
 * @author zhangxd
 * @version 1.0 2023/2/19
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
