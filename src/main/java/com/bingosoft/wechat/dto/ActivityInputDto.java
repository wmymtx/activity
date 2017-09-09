package com.bingosoft.wechat.dto;

import lombok.Data;

/**
 * 活动查询请求参数
 * @author Administrator
 *
 */

@Data
public class ActivityInputDto {
	
	/**
	 * 是否是爆款
	 */
    private boolean isHot;
    
    /**
     * 获取数量
     */
    private int number;
}
