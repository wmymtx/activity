package com.bingosoft.wechat.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UrlConfig {
   @Value("${http.server.deploy}")
   private String deploy;
   
   @Value("${http.server.local}")
   private String local;
}
