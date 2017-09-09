package com.bingosoft.wechat.modal;

public class Modal {
	

	public Modal() {
		super();
	}

	public Modal(int code, boolean success, String message) {
		super();
		this.status = code;
		this.success = success;
		this.message = message;
	}

	private int status;
	
	private boolean success;
	
	private String message;

	public int getCode() {
		return status;
	}

	public void setCode(int code) {
		this.status = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
