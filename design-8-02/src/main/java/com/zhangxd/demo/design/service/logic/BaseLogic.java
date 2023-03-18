package com.zhangxd.demo.design.service.logic;

import com.zhangxd.demo.design.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
public abstract class BaseLogic implements LogicFilter{
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink nodeLine : treeNodeLineInfoList) {
            if (decisionLogic(matterValue, nodeLine)) {
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLine) {
        switch (nodeLine.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLine.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLine.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLine.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLine.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLine.getRuleLimitValue());
            default:
                return false;
        }
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
