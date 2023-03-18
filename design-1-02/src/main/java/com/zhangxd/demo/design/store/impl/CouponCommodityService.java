package com.zhangxd.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.coupon.CouponResult;
import com.zhangxd.demo.design.coupon.CouponService;
import com.zhangxd.demo.design.store.Commodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/22
 */
@Slf4j
public class CouponCommodityService implements Commodity {

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数[优惠券] => uId: {} commodity: {} bizId: {} extMap: {}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]： {}", JSON.toJSON(couponResult));
        if(!"0000".equals(couponResult.getCode())){
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
