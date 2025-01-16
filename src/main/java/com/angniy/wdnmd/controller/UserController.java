package com.angniy.wdnmd.controller;

import com.angniy.wdnmd.pojo.User;
import com.angniy.wdnmd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUserById")
    public User getUserById(Integer id) {
        User user = userService.getUserById(id);
        return user;
    }
}
