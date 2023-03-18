package com.zhangxd.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhangxd.demo.design.card.IQiYiCardService;
import com.zhangxd.demo.design.store.Commodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/2/22
 */
@Slf4j
public class CardCommodityService implements Commodity {

    private IQiYiCardService cardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = "15589784556";
        cardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId: {} commodity: {} bizId: {} extMap: {}", uId, commodityId, bizId, JSON.toJSON(extMap));
    }
}
