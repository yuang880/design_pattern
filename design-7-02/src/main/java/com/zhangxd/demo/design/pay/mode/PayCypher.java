package com.zhangxd.demo.design.pay.mode;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class PayCypher implements PayMode{

    public boolean security(String uId) {
        log.info("密码支付，风控校验环境安全");
        return true;
    }

}
