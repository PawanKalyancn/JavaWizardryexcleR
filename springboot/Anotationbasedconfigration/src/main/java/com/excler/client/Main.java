package com.excler.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excler.Employee;

public class Main {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.excler");
	context.refresh();
	context.getBean("");
	
	Employee emp=(Employee) context.getBean("Employee");
	emp.dispalyemployeeinfo();
	}

}
