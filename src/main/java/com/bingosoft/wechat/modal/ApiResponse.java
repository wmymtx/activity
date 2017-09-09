package com.bingosoft.wechat.modal;

import java.io.Serializable;



public class ApiResponse<T> extends Modal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public ApiResponse(){
		super();
	}
	
	public ApiResponse(int code,boolean success,String message){
		super(code,success,message);
	}
	
	public ApiResponse(int code,boolean success,String message,T obj){
		super(code,success,message);
		this.response = obj;
	}
	
	private T response;

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}
	
	
}
