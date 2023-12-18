package javaday7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userinputdemo3 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner (System.in)) {
			// int result =number1/number2;
				 //System.out.println("result is "+result);
			try 
			{
				System.out.println("enter the voule of numb1");
				 int number1 =scanner.nextInt();
				 System.out.println("enter the numb2");
				 int number2 =scanner.nextInt();
				 
				int result = number1/number2;
				System.out.println("reslut is"+result);
			}
			catch (ArithmeticException e) {
				System.out.println("do not eneter the zero");
			}
			
			catch (InputMismatchException ex) {
				// TODO: handle exception
				System.out.println("enter the number only");
			}
		}
	
	
	}
	

}
