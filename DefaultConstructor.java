package day4;

class Bank
{
	Bank()
	{
		System.out.println("this is constructor");
	}
	
	void display()
	{
		System.out.println("this is a display method");
	}
}



public class DefaultConstructor {

	public static void main(String[] args) {
	
		
		Bank bank = new Bank(); // constructor call during object creation
		bank.display();
	}
}
