package com.bingosoft.wechat.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.bingosoft.wechat.config.UrlConfig;
import com.bingosoft.wechat.service.OperationService;

@Service
public class OperationServiceImpl implements OperationService {

	@Autowired
	RestTemplate restTemplate;  //注入RestTemplate实例

	@Autowired
	UrlConfig urlConfig; //注入UrlConfig实例

	@Override
	public String getUserInfoByPhone(String accountId, String phone) {
		// TODO Auto-generated method stub
		JSONObject json = restTemplate.getForEntity(
				urlConfig.getDeploy() + "operation/api/out/getMobile?accountId=" + accountId + "&phone=" + phone,
				JSONObject.class).getBody();
		return json.toJSONString();
	}

	@Override
	public String getMobile(String openId) {
		// TODO Auto-generated method stub
		JSONObject json = restTemplate
				.getForEntity(urlConfig.getDeploy() + "operation/api/out/getMobile?openId=" + openId, JSONObject.class)
				.getBody();
		return json.toJSONString();
	}

	@Override
	public String getFansInfoByOauth2(String accountId, String code) {
		// TODO Auto-generated method stub
		JSONObject json = restTemplate
				.getForEntity(urlConfig.getDeploy() + "operation/api/out/getFansInfoByOauth2?accountId=" + accountId+"&phone=" + code, JSONObject.class)
				.getBody();
		return json.toJSONString();
	}

	@Override
	public String fansInfo(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
