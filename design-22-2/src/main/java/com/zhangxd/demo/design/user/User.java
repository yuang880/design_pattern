package com.zhangxd.demo.design.user;

import com.zhangxd.demo.design.visitor.Visitor;
import lombok.AllArgsConstructor;

/**
 * @author zhangxd
 * @version 1.0 2023/5/11
 */
@AllArgsConstructor
public abstract class User {

    /**
     * 名字
     */
    public String name;

    /**
     * 身份 ：重点班、普通班 | 特级教师、普通教师、实习教师
     */
    public String identity;

    /**
     * 班级
     */
    public String clazz;

    public abstract void accept(Visitor visitor);

}
