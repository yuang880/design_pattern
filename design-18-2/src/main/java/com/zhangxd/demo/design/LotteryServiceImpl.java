package com.zhangxd.demo.design;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public class LotteryServiceImpl extends LotteryService{

    private final MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
