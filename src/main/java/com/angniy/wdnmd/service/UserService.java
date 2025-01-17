package com.angniy.wdnmd.service;

import com.angniy.wdnmd.pojo.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUsers();
}
