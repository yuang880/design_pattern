package com.zhangxd.demo.design.service.engine;

import com.zhangxd.demo.design.model.aggregates.TreeRich;
import com.zhangxd.demo.design.model.vo.EngineResult;

import java.util.Map;

/**
 * @author zhangxd
 * @version 1.0 2023/3/15
 */
public interface Engine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
