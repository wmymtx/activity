package com.bingosoft.wechat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bingosoft.wechat.modal.ApiResponse;
import com.bingosoft.wechat.modal.ResponseModal;
import com.bingosoft.wechat.modal.ResultCode;
import com.bingosoft.wechat.model.UserInfo;
import com.bingosoft.wechat.model.UserRedis;
import com.bingosoft.wechat.service.IRedisService;
import com.bingosoft.wechat.service.IUserInfoService;
import com.bingosoft.wechat.service.IUserRedisService;
import com.bingosoft.wechat.utils.JSONUtil;
import com.bingosoft.wechat.utils.SerializeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "redis测试", description = "redis功能测试")
@RestController  
public class ExampleController {  
  
    
      
    @Autowired  
    private IRedisService redisService;  
    
    @Autowired
    private IUserRedisService userService;
    
    
      
    @ApiOperation("redis写")
    @PostMapping("/redis/set")  
    public ResponseModal redisSet(@RequestParam("value")String value){  
        boolean isOk = redisService.set("name", value);  
        return new ResponseModal(isOk ? 200 : 500, isOk, isOk ? "success" : "error" , null);  
    }  
      
    @ApiOperation("redis读")
    @PostMapping("/redis/get")  
    public ResponseModal redisGet(){  
        String name = redisService.get("name");  
        return new ResponseModal(ResultCode.SUCCESS.val(), true,"success",name);  
    }  
    
    @ApiOperation("redistest")
    @PostMapping("/redis/test")  
    public ApiResponse<List<UserRedis>> redisTest(){  
    	long begin = System.currentTimeMillis();
    	List<UserRedis> list = new ArrayList<UserRedis>();
        for (int i = 10; i < 50000; i++) {
        	UserRedis user = new UserRedis();
            user.setId("user" + i);
            user.setName("ruijie" + i);
           
            list.add(user);
        }
        List<UserRedis> list1 = new ArrayList<UserRedis>();
        redisService.setList("token", list);
        list1=redisService.getList("token", UserRedis.class);
        //boolean result = userService.batchAdd(list);
        System.out.println(System.currentTimeMillis() - begin);
        
        System.out.println(System.currentTimeMillis() - begin); 
        return new ApiResponse<List<UserRedis>>(200, true,"",list1);  
    }  
    
    
      
}  
