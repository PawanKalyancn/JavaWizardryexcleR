package com.excelar.day6.oops;

interface Breakfast
{
  void eat();
}

class Idly implements Breakfast
{

	@Override
	public void eat() {
         System.out.println("hi iam eating idly");		
	}
	
}

class Dosa implements Breakfast
{

	@Override
	public void eat() {
       System.out.println("hi iam eating dosa");		
	}
	
}

public class LooselyCoupled {

	public static void main(String[] args) {
		
		Breakfast breakfast = new Dosa();
		breakfast.eat();
		
		System.out.println("===================");
		
		Idly idly = new Idly();
		idly.eat();

	}

}
