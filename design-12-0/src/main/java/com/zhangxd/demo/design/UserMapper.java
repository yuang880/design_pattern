package com.zhangxd.demo.design;


import com.zhangxd.demo.design.agent.Select;

/**
 * @author zhangxd
 * @version 1.0 2023/4/1
 */
public interface UserMapper {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
