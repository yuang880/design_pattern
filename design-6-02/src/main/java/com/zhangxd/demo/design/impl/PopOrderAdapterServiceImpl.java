package com.zhangxd.demo.design.impl;

import com.zhangxd.demo.design.OrderAdapterService;
import com.zhangxd.demo.design.service.PopOrderService;

/**
 * @author zhangxd
 * @version 1.0 2023/3/14
 */
public class PopOrderAdapterServiceImpl implements OrderAdapterService {

    private PopOrderService popOrderService = new PopOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
