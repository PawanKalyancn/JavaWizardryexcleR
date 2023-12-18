package com.excelr.exception;

public class InValidPhonenoException  extends RuntimeException{

	String msg;

	public InValidPhonenoException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
