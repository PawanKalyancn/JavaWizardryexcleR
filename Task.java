package com.excelr.day8.collections;


import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {

		ArrayList<String> customerNames = new ArrayList<>();
		
		System.out.println("size =:"+ customerNames.size());
		
		customerNames.add("a");
		customerNames.add("b");
		customerNames.add("c");
		customerNames.add("d");
		customerNames.add("e");
		
		System.out.println("size =:"+ customerNames.size());
		
		System.out.println("-----------------get element------------------------");
		
		System.out.println("all elements :"+ customerNames );
		System.out.println("element at index 1 :"+ customerNames.get(1));
		
		System.out.println("------------------search------------------------");
		
		System.out.println("searching for c element :"+ customerNames.contains("c"));
		System.out.println("searching for h element :"+ customerNames.contains("h"));
		
		System.out.println("------------------remove------------------------");


		        
	}

}
