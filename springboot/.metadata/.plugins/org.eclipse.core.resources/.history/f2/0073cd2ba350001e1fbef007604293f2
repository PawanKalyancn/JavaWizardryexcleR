package com.excler.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandle {

	@ExceptionHandler(IdNotfoundException.class)
	public String  myExceptionResponse(IdNotfoundException ex)
	{
		return ex.getMsg();
	}
	
	@ExceptionHandler(InvaldMovieexpection.class)
	public String invalidPriceResponse(InvaldMovieexpection ex)
	{
		return ex.getMsg();
	}
	
	

}
