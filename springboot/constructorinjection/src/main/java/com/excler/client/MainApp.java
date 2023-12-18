package com.excler.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excler.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("objects.xml");
		
		   // Employee emp = new Employee();
			Employee employee =	(Employee) context.getBean("e");
			
			employee.display();
	}

}
