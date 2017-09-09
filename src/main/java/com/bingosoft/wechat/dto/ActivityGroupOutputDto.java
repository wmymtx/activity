package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 活动拼团信息
 * @author Administrator
 *
 */
@Data
public class ActivityGroupOutputDto {
   
	/**
	 * 活动图片url
	 */
   private String image_url;
   
   /**
    * 拼团剩余参团人数
    */
   private int persons;
   
   /**
    * 拼团Id
    */
   private int group_id;
}
