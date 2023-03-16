package com.zhangxd.demo.design.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Topic {

    /**
     * 选项  A  B  C  D
     */
    private Map<String, String> option;

    /**
     * 答案
     */
    private String key;

}
