package com.bingosoft.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bingosoft.wechat.model.User;
import com.bingosoft.wechat.responsitory.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户信息", description = "管理用户，新增删除修改")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@ApiOperation("新增用户")
	@PostMapping("/add")
	public User addUser(@RequestParam String Id, @RequestParam String userName) {
		User user = new User(Id, userName);
		return userRepository.save(user);
	}
	
	
	@ApiOperation("查询用户")
	@PostMapping("/query")
	
	public User query(@RequestParam String name) {
		
		return userRepository.findUser(name);
	}
}
