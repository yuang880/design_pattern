package com.zhangxd.demo.design.pay.mode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayFingerprintMode implements PayMode {


    public boolean security(String uId) {
        log.info("指纹支付，风控校验指纹信息");
        return true;
    }

}
