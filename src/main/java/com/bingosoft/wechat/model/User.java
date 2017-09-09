package com.bingosoft.wechat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	public User() {
	}
	public User(String _id,String _username)
	{
		this.id=_id;this.userName=_username;
	}
    @Id
    private String id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    
    private String email;
    // 省略构造函数
    // 省略getter和setter
}