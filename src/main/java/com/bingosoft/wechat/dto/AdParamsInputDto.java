package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 获取广告的请求参数
 * @author Administrator
 *
 */
@Data
public class AdParamsInputDto {
	
   /**
    * 展示数量
    */
   private int number;
   
   /**
    * 广告位置或者类型
    */
   private String tag;
}
