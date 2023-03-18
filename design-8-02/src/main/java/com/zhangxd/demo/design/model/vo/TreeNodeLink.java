package com.zhangxd.demo.design.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TreeNodeLink {

    /**
     * 节点From
     */
    private Long nodeIdFrom;

    /**
     * 节点To
     */
    private Long nodeIdTo;

    /**
     * 限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
     */
    private Integer ruleLimitType;

    /**
     * 限定值
     */
    private String ruleLimitValue;

}
