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
public class TreeRoot {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;

}
