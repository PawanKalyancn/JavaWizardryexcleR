package com.excler;

public class Employee {
int id;
String name;
public Employee() {
	super();
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public void displayemployee() {
	System.out.println("id is"+id);
	System.out.println("name is "+name);
}


}
