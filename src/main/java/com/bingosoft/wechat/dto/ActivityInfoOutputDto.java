package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 活动信息
 * @author Administrator
 *
 */
@Data
public class ActivityInfoOutputDto {
	/**
	 * 活动备注
	 */
   private String activity_remark;
   
   /**
    * 活动描述
    */
   private String activity_desc;
   
   /**
    * 活动名称
    */
   private String activity_name;
   
   /**
    * 活动价格
    */
   private String activity_money;
   
   /**
    * 活动结束时间
    */
   private String end_time;
   
   /**
    * 活动图片
    */
   private String image_url;
   
   /**
    * 活动最大参团人数
    */
   private int max_person;
   
   /**
    * 活动最小参团人数
    */
   private int min_person;
   
   /**
    * 开始时间
    */
   private String start_time;
}
