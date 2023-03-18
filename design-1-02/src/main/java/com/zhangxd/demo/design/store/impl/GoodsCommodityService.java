package com.zhangxd.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.zhangxd.demo.design.goods.DeliverReq;
import com.zhangxd.demo.design.goods.GoodsService;
import com.zhangxd.demo.design.store.Commodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/22
 */
@Slf4j
public class GoodsCommodityService implements Commodity {

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq()
                .setUserName("xx")
                .setUserPhone("132465789")
                .setSku(commodityId)
                .setOrderId(bizId)
                .setConsigneeUserName(extMap.get("consigneeUserName"))
                .setConsigneeUserPhone(extMap.get("consigneeUserPhone"))
                .setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        boolean successFlag = goodsService.delieverGoods(deliverReq);

        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{}", successFlag);

        if (!successFlag) {
            throw new RuntimeException("实物商品发放失败");
        }
    }
}
