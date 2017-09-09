package com.bingosoft.wechat.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户信息
 * @author Administrator
 *
 */
@Data
public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final String OBJECT_KEY = "USER";
	
	
	public UserInfo()
	{}
	
	public UserInfo(String mobile,String headimgurl)
	{
		super();
		this.mobile=mobile;
		this.headimgurl=headimgurl;
	}
	
	/**
	 * 微信openId
	 */
    //private String openId;
    
    /**
     * 用户号码
     */
    private String mobile;
    
    /**
     * nickname
     */
    //private String nickname;
    
    /**
     * 头像链接
     */
    private String headimgurl;
    
    /**
     * 地市编码
     */
    //private String city_code;
    
    /**
     * 绑定状态，0代表未绑定；1代表绑定；2代表取消绑定
     */
    //private String phoneStatus;
    
    /**
     * 用户编号
     */
    //private String ranking;
    
    /**
     * 关注状态，0代表未关注；1代表关注；2代表取消关注
     */
   // private String subscrib;
    
    public String getKey() {
        return this.mobile;
    }

    public String getObjectKey() {
        return OBJECT_KEY;
    }
    
}
