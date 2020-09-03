package com.cykj.server_provider.controller;

import com.cykj.server_provider.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller+ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index()
    {
        return "Spring boot欢迎您！";
    }
    @RequestMapping("/getUser")
    public Object getUser()
    {
        User user=new User();
        user.setId(100);
        return user;
    }
}
