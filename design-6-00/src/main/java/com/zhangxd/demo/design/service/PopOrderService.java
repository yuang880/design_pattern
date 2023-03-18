package com.zhangxd.demo.design.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@Slf4j
public class PopOrderService {

    public boolean isFirstOrder(String uId) {
        log.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }

}
