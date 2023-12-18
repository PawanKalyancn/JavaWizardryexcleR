package javaday13java8newfeature;
interface sample1
{
	void diaplay();
}
public class Lamdaexpressiondemo {

	public static void main(String[] args) {
		sample1 Sample1= ()->System.out.println("hello lamda");
		Sample1.diaplay();
	}

}
/*package com.excelr.day13.newfeature;

interface Parent4
{
	void phone();
}


public class LamdaExpressionDemo1 {

	public static void main(String[] args) {

		Parent4 p1 = ()-> System.out.println("nokia");
		
		p1.phone();
		
	}

}*/