package com.excler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Employee{
	@Autowired
	Department department;

 public void dispalyemployeeinfo() {
	System.out.println("this is employee info");
	department.displydeptinfo();
}
}
