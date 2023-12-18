package javaday10;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		System.out.println("hello");
LinkedList<String> customerNames = new LinkedList<String>();
		
		
		customerNames.add("anil");
		customerNames.add("sourab");
		customerNames.addFirst("manish");
		customerNames.addLast("rahul");   // wroks as add
		customerNames.add("rohit");
		
		System.out.println("list :"+ customerNames);
	
		customerNames.set(2, "hello");
		System.out.println(customerNames);
		
		System.out.println(customerNames.remove());
		
		System.out.println("after removing"+customerNames);
        
		customerNames.remove(2);
		System.out.println("after removing"+customerNames);
	}
}
