package com.cykj.eurekaclient.controller;


import com.cykj.eurekaclient.entity.User;
import com.cykj.eurekaclient.server.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {


//    @Autowired
//    private RestTemplate restTemplate;


    @Autowired
    private UserFeign userFeign;


    @RequestMapping("/getUser")
    public Object getUser() {
        System.out.println("请求开始");
        User user = new User();
        User user2 = new User();
        //return this.restTemplate.getForObject("http://server-provider/user/reg", User.class);
        return userFeign.getUser();
    }

}
