package com.xyf.service.impl;

import com.xyf.mapper.UserMapper;
import com.xyf.pojo.entity.User;
import com.xyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author
 * @Date
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User login(User user) {
        String username = user.getUsername();
        User res = userMapper.getUserByUserName(username);

        if (res == null) {
            return null;
        }

        if (! res.getPassword().equals(user.getPassword())) {
            return null;
        }

        return res;
    }
}
