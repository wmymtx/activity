package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 活动信息
 * @author Administrator
 *
 */
@Data
public class AdOutputDto {
	
	/**
	 * 高度
	 */
   private double imageHeight;
   
   /**
    * 宽度
    */
   private double imageWidth;
   
   /**
    * 图片路径
    */
   private String imageUrl;
   
   /**
    * 链接地址
    */
   private String linkUrl;
}
