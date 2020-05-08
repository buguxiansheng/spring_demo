package com.lcfc.spring_demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.lcfc.spring_demo.entity.User;
import com.lcfc.spring_demo.mapper.UserMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sc")
public class VerifyController{
    
    @Autowired
    private UserMapper userMapper;

    
    @RequestMapping("/verify")
    @ResponseBody
    public Map<String, String> add(@RequestBody User user){
        
        
        User user_01=userMapper.selectOne(user.getEmpno());
        Map<String, String> map=new HashMap<>();
        //是否允许登录
        map.put("status", "0");
        // 请求其他页面时进行验证
        map.put("token",user.toString());
        if(null!=user_01 && user_01.getPass().equals(user.getPass())){
            map.put("status", "1");
            map.put("token",user.toString());

            return map;  
        }else{
            map.put("status", "0");
            map.put("token","");
            return map;
        }  
    }
}