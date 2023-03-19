package com.zhangxd.demo.design.config;

import lombok.AllArgsConstructor;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@AllArgsConstructor
public class StarterService {

    private String userStr;

    public String[] split(String separatorChar) {
        return this.userStr.split(separatorChar);
    }
}
