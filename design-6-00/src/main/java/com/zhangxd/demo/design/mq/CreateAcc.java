package com.zhangxd.demo.design.mq;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/3/12
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAcc {

    /**
     * 开户编号
     */
    private String number;

    /**
     * 开户地
     */
    private String address;

    /**
     * 开户时间
     */
    private String accountDate;

    /**
     * 开户描述
     */
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static void main(String[] args) {
        CreateAcc createAcc = new CreateAcc("1", "beijing", DateUtil.format(new Date(), DatePattern.ISO8601_FORMATTER), "test");
        System.out.println(createAcc);
    }
}
