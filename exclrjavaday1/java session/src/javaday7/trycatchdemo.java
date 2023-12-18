package javaday7;

public class trycatchdemo {

	public static void main(String[] args) {
		try
		{
			System.out.println(2/1);
		}
		catch (ArithmeticException | NullPointerException e) // call the proper catch block
		{
			System.out.println("some exception occured");
		}

	}

}
