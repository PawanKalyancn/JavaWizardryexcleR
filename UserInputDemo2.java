package com.excelr.day7.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputDemo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
        try
		{
			System.out.println("enter the value of number1 ");
			int number1 = scanner.nextInt();
			
			System.out.println("enter the value of number2 ");
			int number2 = scanner.nextInt();
			
			int result = number1/number2;
			System.out.println("Result = "+ result);
		}
		catch (ArithmeticException | InputMismatchException e) 
		{
			System.out.println("some thing went wrong");
		}
		
		
		

	}

}
