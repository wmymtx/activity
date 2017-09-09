package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 活动信息列表
 * 
 * @author Administrator
 *
 */
@Data
public class ActivityOutputDto {

	/**
	 * 活动Id
	 */
	private int activityId;

	/**
	 * 活动名称
	 */
	private String activityName;

	/**
	 * 倒计时（秒）
	 */
	private int countDown;

	/**
	 * 图片路径
	 */
	private String imageUrl;
}