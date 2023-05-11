package com.zhangxd.demo.design.user.impl;

import com.zhangxd.demo.design.user.User;
import com.zhangxd.demo.design.visitor.Visitor;

/**
 * @author zhangxd
 * @version 1.0 2023/5/11
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
