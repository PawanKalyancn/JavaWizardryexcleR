package com.excelr.day8.collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> customerNames = new ArrayList<>();
		
		System.out.println("before adding size =:"+ customerNames.size());
		
		customerNames.add("anil");
		customerNames.add("manish");
		customerNames.add("sourab");
		customerNames.add("ankit");
		customerNames.add("rahul");
		
		System.out.println("after adding size =:"+ customerNames.size());
		
		System.out.println("reterive all customer list :"+ customerNames);
		
		//remove the customer by index
		customerNames.remove(1);
		System.out.println("after removing from index 1 :"+ customerNames);

		//remove the customer by object
		customerNames.remove("rahul");
		System.out.println("after removing by object, :"+ customerNames);
		
		//get the customer by index
        System.out.println("reterive customer by index :"+ customerNames.get(1));
		
        //replace by index
        customerNames.set(1, "java programming");
        System.out.println("after replace in the index 1 :"+ customerNames);

        //search the object.
        System.out.println("search the element "+ customerNames.contains("anil"));
        
        customerNames.add(1, "hello world");
        System.out.println("after adding at index 1 :"+ customerNames);
        
        
	}

}
