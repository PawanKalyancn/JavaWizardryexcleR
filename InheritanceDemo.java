package com.excelr.day5.oops2.inheritance;

class Parent
{
	Parent(int id)
	{
		System.out.println("parent constructor "+ id);
	}
}

class Child extends Parent
{
	Child() 
	{
		super(1);
		System.out.println("child constructor");
	}
	
}



public class InheritanceDemo {

	public static void main(String[] args) {

		Child child = new Child();
	}

}
