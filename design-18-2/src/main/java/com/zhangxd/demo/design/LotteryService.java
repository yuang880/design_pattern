package com.zhangxd.demo.design;

import com.zhangxd.demo.design.event.EventManager;
import com.zhangxd.demo.design.event.listener.impl.MQEventListener;
import com.zhangxd.demo.design.event.listener.impl.MessageEventListener;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public abstract class LotteryService {

    private final EventManager eventManager;

    protected LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.MESSAGE);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.MESSAGE, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        // 需要什么通知就给调用什么方法
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.MESSAGE, lotteryResult);
        return lotteryResult;
    }

    /**
     * 执行方法
     *
     * @param uId 用户ID
     * @return LotteryResult
     */
    protected abstract LotteryResult doDraw(String uId);

}
