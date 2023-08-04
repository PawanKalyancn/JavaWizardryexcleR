package com.excelr.day5.oops2;


class Flipkart
{
	void filter()
	{
		System.out.println("default filter");
	}
	
	void filter(int price)
	{
		System.out.println("filter by price");
	}
	
	void filter(String brandName)
	{
		System.out.println("filter by brand name");

	}
	
	
	
	void filter(int price,String brandName)
	{
		System.out.println("filter by price and brand name");

	}
}

public class Overloading {

	public static void main(String[] args) {

		Flipkart flipkart = new Flipkart();
		flipkart.filter("nike");
		flipkart.filter();
		flipkart.filter(4560);
		
	}

}
