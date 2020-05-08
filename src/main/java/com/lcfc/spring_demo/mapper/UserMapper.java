package com.lcfc.spring_demo.mapper;

import com.lcfc.spring_demo.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    
    //登录验证
    public User selectOne(String empno);

}