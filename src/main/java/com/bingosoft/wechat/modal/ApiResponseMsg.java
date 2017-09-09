package com.bingosoft.wechat.modal;

import java.io.Serializable;

public class ApiResponseMsg extends Modal implements Serializable {
	private static final long serialVersionUID = 1L;

	public ApiResponseMsg(){
		super();
	}

	public ApiResponseMsg(int code,boolean success,String message){
		super(code,success,message);
	}
}
