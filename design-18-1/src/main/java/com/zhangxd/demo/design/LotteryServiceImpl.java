package com.zhangxd.demo.design;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@Slf4j
public class LotteryServiceImpl implements LotteryService {

    private final MinibusTargetService service = new MinibusTargetService();

    @Override
    public LotteryResult doDraw(String uId) {
        String lottery = service.lottery(uId);
        // 发短信
        log.info("给用户 {} 发送短信通知(短信)：{}", uId, lottery);
        // 发MQ消息
        log.info("记录用户 {} 摇号结果(MQ)：{}", uId, lottery);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
