package com.excler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("objects.xml");
		
   // Employee emp = new Employee();
	Employee employee =	(Employee) context.getBean("e");
	
	employee.display();
		
		
	}

}
