package com.zhangxd.demo.design.mapper;

import com.zhangxd.demo.design.po.User;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public interface UserMapper {

    User queryUserInfoById(Long id);

}
