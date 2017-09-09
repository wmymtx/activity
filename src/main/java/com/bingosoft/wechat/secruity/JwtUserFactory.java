package com.bingosoft.wechat.secruity;

import com.bingosoft.wechat.model.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getUserName(),user.getPassword()
              
        );
    }

//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
//        return authorities.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
}

