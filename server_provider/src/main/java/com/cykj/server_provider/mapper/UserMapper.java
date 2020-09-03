package com.cykj.server_provider.mapper;

import com.cykj.server_provider.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {

    public int add(User user);


}
