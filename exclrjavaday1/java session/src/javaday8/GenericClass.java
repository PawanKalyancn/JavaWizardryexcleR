package javaday8;

import java.util.ArrayList;

public class GenericClass {

	public static void main(String[] args) {

		ArrayList<Integer> nums =new ArrayList<Integer>();//nums is object
		nums.add(1);
		nums.add(2);
		//nums.add("hello") we cant add string 
	
		ArrayList<String> names =  new ArrayList<String> ();
		names.add("npawam");
		names.add("pk"); //we cant add intgers in this 
		
		Product p1 = new Product(1,"laptop","eletronics",822000);
		//user definded class
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(new Product(2,"mobile","electronics",13000));
		products.add(new Product(3,"t-shirt","cloth",4000));

		System.out.println(products);
		
	}

}
