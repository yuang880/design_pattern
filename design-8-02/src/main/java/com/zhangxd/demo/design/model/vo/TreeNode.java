package com.zhangxd.demo.design.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TreeNode {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树节点ID
     */
    private Long treeNodeId;
    /**
     * 节点类型；1子叶、2果实
     */
    private Integer nodeType;

    /**
     * 节点值[nodeType=2]；果实值
     */
    private String nodeValue;

    /**
     * 规则Key
     */
    private String ruleKey;

    /**
     * 规则描述
     */
    private String ruleDesc;

    /**
     * 节点链路
     */
    private List<TreeNodeLink> treeNodeLinkList;

}
