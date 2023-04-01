package com.zhangxd.demo.design;

import com.zhangxd.demo.design.util.RedisUtil;

/**
 * @author zhangxd
 * @version 1.0 2023/3/22
 */
public class ActivityController {

    private RedisUtil redisUtils = new RedisUtil();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}
