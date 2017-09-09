package com.bingosoft.wechat.service;

import java.util.List;

import com.bingosoft.wechat.model.UserInfo;

public interface IUserInfoService {
	/**
     * 新增用户
     * @return
     */
    boolean add(UserInfo userInfo,String token);
    /**
     * 批量新增，使用list的方式
     * @param users
     * @return
     */
    boolean batchAdd(List<UserInfo> users);
    /**
     * 删除一条数据
     * @param key
     */
    void delete(String key);

    /** 
     * 删除多个 
     * @param keys 
     */  
    void delete(List<String> keys); 
    /**
     * 修改
     * @param user
     * @return
     */
    boolean update(UserInfo user,String token);
    /**
     * 根据key获取用户
     * @param keyId
     * @return
     */
    UserInfo get(String keyId);
}
