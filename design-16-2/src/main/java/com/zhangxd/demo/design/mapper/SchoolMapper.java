package com.zhangxd.demo.design.mapper;

import com.zhangxd.demo.design.po.School;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public interface SchoolMapper {

    School querySchoolInfoById(Long treeId);

}
