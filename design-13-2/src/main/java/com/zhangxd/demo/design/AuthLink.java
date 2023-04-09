package com.zhangxd.demo.design;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 审核规定；
 * 601-610 三级审批 + 二级审批
 * 611-620 三级审批 + 二级审批 + 一级审批
 * 其他时间 三级审批
 *
 * @author zhangxd
 * @version 1.0 2023/4/1
 */
@Slf4j
public abstract class AuthLink {

    protected String levelUserId;

    protected String levelUserName;

    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
