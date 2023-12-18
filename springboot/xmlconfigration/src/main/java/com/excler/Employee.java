package com.excler;

public class Employee {

	  String name;
	  int age;
	   Dept dept;
	  
	  
	public void setDept(Dept dept) {
		this.dept = dept;
	}

     public void setName(String name) {
		this.name = name;
	}

     public void setAge(int age) {
		this.age = age;
	}

	void display()
	  {
		  System.out.println("display method");
		  System.out.println("name is "+ name);
		  System.out.println("age is "+ age);
		   dept.deptInfo();
		
	  }
}
