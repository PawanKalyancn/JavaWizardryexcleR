package com.excelar.day6.oops;

abstract class Operation
{
	void greet()
	{
		System.out.println("hi welcome all...");
	}
	
	abstract void calculate(int a,int b);
}

class Addition extends Operation
{

	@Override
	void calculate(int a, int b) 
	{
		System.out.println(a+b);
	}
	
}




public class AbstractClassDemo {

	public static void main(String[] args) {

		Addition addition = new Addition();
		addition.calculate(2, 3);
		addition.greet();
		
		System.out.println("----------------");
		
		Operation obj = new Addition();
		obj.calculate(3, 3);
		obj.greet();
	}

}
