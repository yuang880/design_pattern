package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.OrderAdapterService;
import com.zhangxd.demo.design.service.OrderService;

/**
 * @author zhangxd
 * @version 1.0 2023/3/14
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
