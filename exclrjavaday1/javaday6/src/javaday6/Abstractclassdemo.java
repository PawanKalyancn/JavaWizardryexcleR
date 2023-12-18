package javaday6;

abstract class Operation
{
	void greet()  ///normal method
	{
		System.out.println("hello welcome");
	}
	
	abstract void calculate(int a,int b); //abstract method
	}

	class Addition extends Operation
	{

		@Override
		void calculate(int a, int b) 
		{
			System.out.println(a-b);
		}
		
	}

	public class Abstractclassdemo {
 public static void main(String[] args) {
		Addition addition = new Addition();
		addition.calculate(2, 3);
		addition.greet();
		
	}

}
