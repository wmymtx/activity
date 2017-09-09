package com.bingosoft.wechat.service;

import java.util.List;


import com.bingosoft.wechat.model.UserRedis;

public interface IUserRedisService {
	/**
     * 新增用户
     * @return
     */
    boolean add(UserRedis userInfo,String token);
    /**
     * 批量新增，使用list的方式
     * @param users
     * @return
     */
    boolean batchAdd(List<UserRedis> users);
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
    boolean update(UserRedis user,String token);
    /**
     * 根据key获取用户
     * @param keyId
     * @return
     */
    UserRedis get(String keyId);
}
