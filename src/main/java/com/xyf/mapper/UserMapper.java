package com.xyf.mapper;

import com.xyf.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    User getUser();

    @Select("select * from user where username = #{username}")
    User getUserByUserName(String username);
}
