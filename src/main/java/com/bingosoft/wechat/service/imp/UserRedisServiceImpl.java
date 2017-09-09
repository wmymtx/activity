package com.bingosoft.wechat.service.imp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.bingosoft.wechat.model.UserInfo;
import com.bingosoft.wechat.service.AbstractBaseRedisService;
import com.bingosoft.wechat.service.IUserInfoService;

@Service
public class UserRedisServiceImpl extends AbstractBaseRedisService<String, Serializable>
implements IUserInfoService{

	@Override
	public boolean add(UserInfo userInfo, String token) {
		// TODO Auto-generated method stub
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

            @Override
            public Boolean doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> valueOper = redisTemplate.opsForValue();
                valueOper.set(token, userInfo);
                return true;
            }
        }, false, true);
        return result;
	}

	@Override
	public boolean batchAdd(List<UserInfo> users) {
		// TODO Auto-generated method stub
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

            @Override
            public Boolean doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> valueOper = redisTemplate.opsForValue();
                for (UserInfo user : users) {
                    valueOper.set(user.getMobile(), user);
                }
                return true;
            }
        }, false, true);
        return result;
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
        list.add(key);
        delete(list);
	}

	@Override
	public void delete(List<String> keys) {
		// TODO Auto-generated method stub
		redisTemplate.delete(keys);
	}

	@Override
	public boolean update(UserInfo user, String token) {
		// TODO Auto-generated method stub
		String id = token;
        if (get(id) == null) {
            throw new NullPointerException("数据行不存在, key = " + id);
        }
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> valueOper = redisTemplate.opsForValue();
                valueOper.set(token, user);
                return true;
            }
        });
        return result;
	}

	@Override
	public UserInfo get(String keyId) {
		// TODO Auto-generated method stub
		UserInfo result = redisTemplate.execute(new RedisCallback<UserInfo>() {
            public UserInfo doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> operations = redisTemplate.opsForValue();
                UserInfo user = (UserInfo) operations.get(keyId);
                return user;
            }
        });
        return result;
	}

	

}
