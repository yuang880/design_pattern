package com.zhangxd.demo.design.impl;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.zhangxd.demo.design.AuthInfo;
import com.zhangxd.demo.design.AuthLink;
import com.zhangxd.demo.design.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/4/1
 */
public class Level2Auth extends AuthLink {

    private Date dateStart = DateUtil.parse("2020-06-11 00:00:00", DatePattern.NORM_DATETIME_FORMAT);

    private Date dateEnd = DateUtil.parse("2020-06-20 23:59:59", DatePattern.NORM_DATETIME_FORMAT);

    public Level2Auth(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", DateUtil.format(date, DatePattern.NORM_DATETIME_FORMAT), " 审批人：", levelUserName);
        }

        if (authDate.before(dateStart) || authDate.after(dateEnd)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", DateUtil.format(date, DatePattern.NORM_DATETIME_FORMAT), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }

}
