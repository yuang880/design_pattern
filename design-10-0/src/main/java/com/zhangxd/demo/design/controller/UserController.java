package com.zhangxd.demo.design.controller;

import com.zhangxd.demo.design.annocation.DoDoor;
import com.zhangxd.demo.design.po.User;
import com.zhangxd.demo.design.resut.ResultContext;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangxd
 * @version 1.0 2023/3/18
 */
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 查询用户信息
     * http://localhost:8082/user/query?userId=1001
     */
    @GetMapping("/query")
    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    public String queryUserInfo(@RequestParam  String userId) {
        User user = new User(userId, 18, "beijing");
        return ResultContext.buildSuccess(user);
    }

    /**
     * 查询用户信息
     * http://localhost:8082/user/list/1001
     */
    @PostMapping("/list/{userId}")
    public String list(@PathVariable String userId) {
        User user = new User(userId, 18, "beijing");
        return ResultContext.buildSuccess(user);
    }

}
