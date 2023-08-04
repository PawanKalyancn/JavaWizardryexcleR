package com.excelr.day8.collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		
		System.out.println("num1 :"+ num1);
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(4);
		num2.add(5);
		num2.add(6);
		num2.add(7);
		num2.add(8);
		
		System.out.println("num2 :"+ num2);
		
		//num2.addAll(num1);
		num2.removeAll(num1);
		//System.out.println("num2 :"+ num2);
		
		num2.addAll(num1);
		System.out.println("num2 :"+ num2);
		
		
		
	}

}
