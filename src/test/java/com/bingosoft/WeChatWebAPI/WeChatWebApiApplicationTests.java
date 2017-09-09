package com.bingosoft.WeChatWebAPI;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bingosoft.wechat.model.User;
import com.bingosoft.wechat.model.UserInfo;
import com.bingosoft.wechat.responsitory.UserRepository;
import com.bingosoft.wechat.service.IUserInfoService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeChatWebApiApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private IUserInfoService userService;
	
	
	/**
     * 批量新增 一条一条的方式 606ms,效率更高
     */
    @Test
    public void testAddUsers2() {
        List<UserInfo> list = new ArrayList<UserInfo>();
        for (int i = 10; i < 50000; i++) {
        	UserInfo user = new UserInfo();
            user.setMobile("user" + i);
            user.setHeadimgurl("ruijie" + i);
            list.add(user);
        }
        long begin = System.currentTimeMillis();
        boolean result = userService.batchAdd(list);
        System.out.println(System.currentTimeMillis() - begin);
        System.out.println(result);
    }
	
	@Test
	public void contextLoads() {
		// 创建10条记录
				
		
	}

}
