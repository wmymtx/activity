package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 热销活动
 * @author Administrator
 *
 */
@Data
public class HotActivityOutputDto {
	
	/**
	 * 活动名称
	 */
   private String activity_name;
   
   /**
    * 活动id
    */
   private int activity_id;
   
   /**
    * 活动名称
    */
   private String image_url;
}
