package com.bingosoft.wechat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.bingosoft.wechat.config.UrlConfig;
import com.bingosoft.wechat.secruity.utils.JwtTokenUtil;
import com.bingosoft.wechat.service.OperationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "10086接口", description = "调用10086接口")
@RestController
@RequestMapping("/Operation/api")
public class OperationController {
	@Autowired
	OperationService operationService;

	@Value("${jwt.header}")
	private String tokenHeader;

	@Value("${jwt.tokenHead}")
	private String tokenHead;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@ApiOperation("根据openid获取绑定手机号")
	@PostMapping("/getMobile")
	public String getMobile(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
		final String authToken = token.substring(tokenHead.length()); // The part after "Bearer "
		String openId = jwtTokenUtil.getUsernameFromToken(authToken);
		return operationService.getMobile(openId);

	}

	@ApiOperation("通过手机号获取用户基本信息")
	@PostMapping("/getUserInfoByPhone")
	public String getUserInfoByPhone(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
		final String authToken = token.substring(tokenHead.length()); // The part after "Bearer "
		String openId = jwtTokenUtil.getUsernameFromToken(authToken);
		return operationService.getUserInfoByPhone(token, openId);
	}

}
