package com.angniy.wdnmd.mapper;

import com.angniy.wdnmd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") Integer id);
}
