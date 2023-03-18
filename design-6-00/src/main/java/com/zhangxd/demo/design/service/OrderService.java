package com.zhangxd.demo.design.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@Slf4j
public class OrderService {
    public long queryUserOrderCount(String userId){
        log.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
