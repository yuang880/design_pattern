package com.zhangxd.demo.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品
 * @author zhangxd
 * @version 1.0 2023/2/20
 */
public class GoodsService {

    public boolean delieverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
