package com.zhangxd.demo.design.visitor.impl;

import com.zhangxd.demo.design.user.impl.Student;
import com.zhangxd.demo.design.user.impl.Teacher;
import com.zhangxd.demo.design.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxd
 * @version 1.0 2023/5/11
 */
@Slf4j
public class Parent implements Visitor {

    public void visit(Student student) {
        log.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    public void visit(Teacher teacher) {
        log.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
