package com.excelr.day7.exception;

import java.io.IOException;

class InValidAgeException extends Exception
{
	String msg;

	InValidAgeException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}

class User
{
	public void checkEligiblity(int age) throws InValidAgeException
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		
		else
			throw new InValidAgeException("age is less, It should be minimum 18");
	}
}



public class UserDefinedException {

	public static void main(String[] args)  {

		User user = new User();
		
		try {
			user.checkEligiblity(3);
		} catch (InValidAgeException e) 
		{
			System.out.println(e.getMsg());
			System.out.println(e.getMessage());
		}
		
	}

}
