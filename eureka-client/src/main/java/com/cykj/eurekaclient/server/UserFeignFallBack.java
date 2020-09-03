package com.cykj.eurekaclient.server;


import com.cykj.eurekaclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class UserFeignFallBack implements UserFeign {


    //在出现熔断的情况下，返回给用户端的错误提示
    @Override
    public User getUser() {
        return new User();
    }
}
