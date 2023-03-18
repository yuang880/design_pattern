package com.zhangxd.demo.design;

import com.zhangxd.demo.design.store.Commodity;
import com.zhangxd.demo.design.store.impl.CardCommodityService;
import com.zhangxd.demo.design.store.impl.CouponCommodityService;
import com.zhangxd.demo.design.store.impl.GoodsCommodityService;

/**
 * @author zhangxd
 * @version 1.0 2023/2/22
 */
public class StoreFactory {

    public Commodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
