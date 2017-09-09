package com.bingosoft.wechat.service;

import com.bingosoft.wechat.model.User;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
