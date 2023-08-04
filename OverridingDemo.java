package com.excelr.day5.oops2;

class Parent
{
  	void breakfast()
	{
		System.out.println("idly");
	}
	
	
}

class Child extends Parent
{
	
	void breakfast()
	{
		System.out.println("dosa");
	}
   
}




public class OverridingDemo {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
		
		
	}

}
