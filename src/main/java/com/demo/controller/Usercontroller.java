package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private UserService userService;

    /**
     * 查找全部
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAllUser(){
       return userService.findAllUser();
    }
}
