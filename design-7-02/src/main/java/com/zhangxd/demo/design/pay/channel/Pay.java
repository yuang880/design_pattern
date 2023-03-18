package com.zhangxd.demo.design.pay.channel;

import com.zhangxd.demo.design.pay.mode.PayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author zhangxd
 * @version 1.0 2023/3/14
 */
@Slf4j
public abstract class Pay {

    protected PayMode payMode;

    public Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
