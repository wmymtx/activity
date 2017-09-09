package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 热销活动请求参数
 * @author Administrator
 *
 */
@Data
public class HotActivityInputDto {
	
	/**
	 * 活动Id
	 */
   private int activity_id;
   
   /**
    * 获取活动数量
    */
   private int number;
}
