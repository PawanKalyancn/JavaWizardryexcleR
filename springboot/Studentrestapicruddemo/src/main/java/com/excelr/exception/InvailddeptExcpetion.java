package com.excelr.exception;

public class InvailddeptExcpetion extends RuntimeException  {
	String msg;

	public InvailddeptExcpetion(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}

