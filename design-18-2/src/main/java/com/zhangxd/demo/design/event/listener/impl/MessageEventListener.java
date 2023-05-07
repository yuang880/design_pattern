package com.zhangxd.demo.design.event.listener.impl;

import com.zhangxd.demo.design.LotteryResult;
import com.zhangxd.demo.design.event.listener.EventListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信)：{}", result.getUId(), result.getMsg());
    }

}
