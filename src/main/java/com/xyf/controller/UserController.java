package com.xyf.controller;

import com.xyf.common.Result;
import com.xyf.pojo.entity.User;
import com.xyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description
 * @Author
 * @Date
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping()
    public String getUser(String id){
        return id + "get_user";
    }

    @PostMapping
    public String postUser(){
        return "post_user";
    }

    @PostMapping("/login")
    public Result login(User user){
        User res = service.login(user);

        if (res == null) {
            return Result.error("用户名或密码错误");
        }
        return Result.success(res).setMsg("登录成功");
    }
}
