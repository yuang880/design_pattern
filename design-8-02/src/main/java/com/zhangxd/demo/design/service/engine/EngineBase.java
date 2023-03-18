package com.zhangxd.demo.design.service.engine;

import com.zhangxd.demo.design.model.aggregates.TreeRich;
import com.zhangxd.demo.design.model.vo.EngineResult;
import com.zhangxd.demo.design.model.vo.TreeNode;
import com.zhangxd.demo.design.model.vo.TreeRoot;
import com.zhangxd.demo.design.service.logic.LogicFilter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
@Slf4j
public abstract class EngineBase extends EngineConfig implements Engine {

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            log.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
