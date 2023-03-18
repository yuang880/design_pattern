package com.zhangxd.demo.design.model.aggregates;

import com.zhangxd.demo.design.model.vo.TreeNode;
import com.zhangxd.demo.design.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * 规则树聚合
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TreeRich {

    /**
     * 树根信息
     */
    private TreeRoot treeRoot;

    /**
     * 树节点ID -> 子节点
     */
    private Map<Long, TreeNode> treeNodeMap;

}
