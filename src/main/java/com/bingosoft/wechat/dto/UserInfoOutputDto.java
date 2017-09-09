package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 用户基本信息
 * @author Administrator
 *
 */
@Data
public class UserInfoOutputDto {
   /**
    * 用户头像
    */
   private String image_url;
   
   /**
    * 用户昵称
    */
   private String nick_name;
   
   /**
    * 手机号码
    */
   private String phone_no;
}
