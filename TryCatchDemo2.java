package com.excelr.day7.exception;

public class TryCatchDemo2 {

	public static void main(String[] args) {

		int marks[]=new int[5];
		
		try
		{
			System.out.println(2/2);
			marks[7]=68;
		}	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  objName ) // call the proper catch block
		{
			System.out.println(objName.getMessage());
			
		}
		
	}

}


