package com.cykj.server_provider.service.imp;


import com.cykj.server_provider.entity.User;
import com.cykj.server_provider.mapper.UserMapper;
import com.cykj.server_provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    public UserMapper userMapper;



    /**
     * 注册会员，送积分
     *
     * @param user
     * @return
     */
    @Override
    public int reg(User user) {
        int n = 0;
        n = userMapper.add(user);

        return n;
    }


}
