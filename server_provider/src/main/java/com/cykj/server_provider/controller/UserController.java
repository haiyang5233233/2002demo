package com.cykj.server_provider.controller;

import com.cykj.server_provider.entity.User;
import com.cykj.server_provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller+ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/reg")
    public User reg()
    {

        User user=new User();
        user.setId(100);
        user.setTrueName("张三");
       int n= userService.reg(user);

        return user;
    }

}
