package com.bingosoft.WeChatWebAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages={"com.bingosoft.whechat.service","com.bingosoft.whechat.serviceimp","com.bingosoft.whechat.secruity","com.bingosoft.whechat.model","com.bingosoft.whechat.config","com.bingosoft.whechat.controller","com.bingosoft.whechat.responsitory"})  
@SpringBootApplication
public class WeChatWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeChatWebApiApplication.class, args);
	}
}
