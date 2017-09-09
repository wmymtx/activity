package com.bingosoft.wechat.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bingosoft.wechat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	User findByUserName(String name);
  
    
    @Query("from User u where u.userName=:name")
    User findUser(@Param("name") String name);
}
