package com.excelr.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.Breakfast;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("objects.xml");
	 Breakfast breakfast =   (Breakfast) context.getBean("b");
	 breakfast.showBreakfastdetails();
	
	}

}