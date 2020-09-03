package com.cykj.eurekaclient.server;


import com.cykj.eurekaclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="SERVER-PROVIDER",fallback=UserFeignFallBack.class)
public interface UserFeign {

    @RequestMapping(value="/user/reg")
    public User getUser();
}
