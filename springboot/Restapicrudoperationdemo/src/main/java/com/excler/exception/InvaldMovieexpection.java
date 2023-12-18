package com.excler.exception;

public class InvaldMovieexpection extends RuntimeException {
	String msg;
	
	public InvaldMovieexpection(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}