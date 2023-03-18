package com.zhangxd.demo.design;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/1
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChoiceQuestion {
    private String name;
    private Map<String, String> options;
    private String key;
}
