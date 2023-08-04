package javaday9;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LISTitrrationanditreator {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println("num1 :"+ nums);
		
		ListIterator<Integer> listitr =nums.listIterator();
		
		System.out.println("---backward direction-----");
		while(listitr.hasPrevious())
			System.out.println(listitr.previous());
		
		
		System.out.println("---forward direction-----");
		while(listitr.hasNext())
			System.out.println(listitr.next());
		
		
		System.out.println("---backward direction-----");
		while(listitr.hasPrevious())
			System.out.println(listitr.previous());
	
	//=======================

	///irtor example
		
		

			  
		
	}

}
