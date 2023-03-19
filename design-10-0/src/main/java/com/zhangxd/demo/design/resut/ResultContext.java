package com.zhangxd.demo.design.resut;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@Getter
@Setter
@Slf4j
public class ResultContext {

    private String code;
    private String info;

    public static String buildSuccess(Object result) {
        return "code: 0000, info: success, Result: " + result;
    }
}
