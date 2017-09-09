package com.bingosoft.wechat.service;

public interface OperationService {
	/**
	 * 通过手机号获取用户基本信息(get)
	 * @param accountId
	 * @param phone
	 * @return
	 */
	String getUserInfoByPhone(String accountId, String phone);
	
	/**
	 * 根据openid获取用户绑定手机号
	 * @param openId
	 * @return
	 */
	String getMobile(String openId);
	
	/**
	 * 根据code获取用户基本信息，code由腾讯网页授权返回
	 * @param accountId 公众号ID
	 * @param code 填写获取的code参数
	 * @return
	 */
	String getFansInfoByOauth2(String accountId,String code);
	
	/**
	 * 获取用户信息
	 * @param code
	 * @return
	 */
	String fansInfo(String code);
	
	
}
