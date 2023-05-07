package com.zhangxd.demo.design.event.listener.impl;

import com.zhangxd.demo.design.LotteryResult;
import com.zhangxd.demo.design.event.listener.EventListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@Slf4j
public class MQEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult result) {
        log.info("记录用户 {} 摇号结果(MQ)：{}", result.getUId(), result.getMsg());
    }
}
