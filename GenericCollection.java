package com.excelr.day8.collections;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		//nums.add("hi");
		System.out.println(nums);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("sachin");
		names.add("rahul");
		
		System.out.println(names);
		
		
		Product p1 = new Product(1, "laptop", "electronics", 92000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(new Product(2,"mobile","electronics",13000));
		products.add(new Product(3,"t-shirt","cloth",4000));

		System.out.println(products);
		
		
	}

}
