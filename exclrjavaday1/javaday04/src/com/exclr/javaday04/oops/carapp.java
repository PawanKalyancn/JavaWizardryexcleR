package com.exclr.javaday04.oops;
class Car
{
	// variable -- data memeber
	int modelNo;
	double price;
	String color;
	int kilometerDriven;
	
	
	//method  -- memeber function
	void checkCarStatus()
	{
		if(kilometerDriven<=5000)
			System.out.println("car is new");
		else if(kilometerDriven>5000 && kilometerDriven<=20000)
			System.out.println("car is in good condition");
		else
			System.out.println("car is old");
	}
	
	 void displayCarInfo()
	  {
		  System.out.println("-----car info------");
		  System.out.println("color :"+ color);
		  System.out.println("model :"+ modelNo);
		  System.out.println("price :"+ price);
		  System.out.println("kilometer driven :"+ kilometerDriven);
		  System.out.println("=========================");
	  }
	
	
	
}
public class carapp {

	public static void main(String[] args) {
		Car car = new Car();
		car.color="red";
		car.modelNo=2021;
		car.kilometerDriven=34000;
		car.price=700000;
		
		
		Car car2 = new Car();
		car2.color="blue";
		car2.modelNo=2023;
		car2.kilometerDriven=2000;
		car2.price=800000;
		
		car.checkCarStatus();
		System.out.println("==========");
		car2.checkCarStatus();
		
		car.displayCarInfo();
		car2.displayCarInfo();
		
		}
}
