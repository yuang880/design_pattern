package com.zhangxd.demo.design.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 树节点链路
 * @author zhangxd
 * @version 1.0 2023/4/15
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Link {

    private String fromId;

    private String toId;

}
