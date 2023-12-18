package javaday5;
class Flipkart
{
	void filter() //method name
	{
		System.out.println("default filter");
	}
	
	void filter(int price) //method function overloading
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
//one method can have many forms with same method name and differter forms or operations

public class overloadingdemo {

	public static void main(String[] args) {

		Flipkart flipkart = new Flipkart();
		flipkart.filter();
		flipkart.filter(5000);
		flipkart.filter(5000,"puma");
		flipkart.filter("pawan kalyan");

		
	}

}
