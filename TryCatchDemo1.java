package com.excelr.day7.exception;

public class TryCatchDemo1 {

	public static void main(String[] args) {

		try
		{
			System.out.println(2/0);
		}	
		catch(ArithmeticException exObj) // call the proper catch block
		{
			System.out.println("some exception occured "+ exObj.getMessage());
			exObj.printStackTrace();
		}
		
		
		
		
		
	}

}
