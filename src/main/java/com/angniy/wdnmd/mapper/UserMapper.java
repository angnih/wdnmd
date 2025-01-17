package com.angniy.wdnmd.mapper;

import com.angniy.wdnmd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") Integer id);
    List<User> getAllUsers();
}
