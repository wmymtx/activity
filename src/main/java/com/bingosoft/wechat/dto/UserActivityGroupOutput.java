package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 查询用户拼团信息
 * @author Administrator
 *
 */
@Data
public class UserActivityGroupOutput {
	
	/**
	 * 活动Id
	 */
   private int activity_id;
   
   /**
    * 活动图片路径
    */
   private String image_url;
}
