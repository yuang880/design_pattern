package com.zhangxd.demo.design.event.listener;

import com.zhangxd.demo.design.LotteryResult;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
