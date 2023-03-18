package com.zhangxd.demo.design.service.engine.impl;

import com.zhangxd.demo.design.model.aggregates.TreeRich;
import com.zhangxd.demo.design.model.vo.EngineResult;
import com.zhangxd.demo.design.model.vo.TreeNode;
import com.zhangxd.demo.design.service.engine.EngineBase;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
