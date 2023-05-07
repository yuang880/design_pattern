package com.zhangxd.demo.design.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class XNode {

    private String namespace;

    private String id;

    private String parameterType;

    private String resultType;

    private String sql;

    private Map<Integer, String> parameter;
}
