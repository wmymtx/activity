package com.bingosoft.wechat.service.imp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.bingosoft.wechat.model.UserRedis;
import com.bingosoft.wechat.service.AbstractBaseRedisService;
import com.bingosoft.wechat.service.IUserRedisService;

@Service
public class UserInfoServiceImpl extends AbstractBaseRedisService<String, Serializable>
implements IUserRedisService{

	@Override
	public boolean add(UserRedis userInfo, String token) {
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
	public boolean batchAdd(List<UserRedis> users) {
		// TODO Auto-generated method stub
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

            @Override
            public Boolean doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> valueOper = redisTemplate.opsForValue();
                for (UserRedis user : users) {
                    valueOper.set(user.getId(), user);
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
	public boolean update(UserRedis user, String token) {
		// TODO Auto-generated method stub
		String id = user.getId();
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
	public UserRedis get(String keyId) {
		// TODO Auto-generated method stub
		UserRedis result = redisTemplate.execute(new RedisCallback<UserRedis>() {
            public UserRedis doInRedis(RedisConnection connection)
                    throws DataAccessException {
                ValueOperations<String, Serializable> operations = redisTemplate.opsForValue();
                UserRedis user = (UserRedis) operations.get(keyId);
                return user;
            }
        });
        return result;
	}

	

}
