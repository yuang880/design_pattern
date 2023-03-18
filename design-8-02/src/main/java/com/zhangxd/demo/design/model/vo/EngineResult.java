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
public class EngineResult {

    /**
     * 执行结果
     */
    private boolean isSuccess;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 果实节点ID
     */
    private Long nodeId;

    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

}
