package com.excelr.day5.oops2;

class Employee
{
    private	int id;
    private	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
	
}



public class EncapuslationDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		//emp.id=1;
		//emp.name="sachin";
		
		emp.setId(1);
		emp.setName("rahul");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		
		
		
		
	}

}
