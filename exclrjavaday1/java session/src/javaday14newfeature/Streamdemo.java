package javaday14newfeature;

import java.util.ArrayList;

public class Streamdemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees =new ArrayList<Employee>();
		employees.add(new Employee(1, "john", "hr", 68000, 23));
		employees.add(new Employee(2, "rohan", "developer", 88000, 26));
		employees.add(new Employee(3, "ankit", "tester", 57000, 24));
		employees.add(new Employee(4, "sourab", "hr", 92000, 31));
		employees.add(new Employee(5, "lavanya", "developer", 91000, 32));
		employees.add(new Employee(6, "sumit", "hr", 74000, 25));

		System.out.println("printing all the object");
		employees.forEach(e->System.out.println(e));
        
		System.out.println("-----using method reference");
		employees.forEach(System.out::println);
		
		System.out.println("----display only dept----");
		employees.stream().filter(e->e.getDept().equals("hr")).forEach(System.out::println);
		
		System.out.println("display age gretsrthan 30");
		employees.stream().filter(e->e.getAge()>30).forEach(System.out::println);
		
		System.out.println("for increaimg salary");
		//employees.stream().map(e->getSalary()+1000).forEach(System.out::println));
		System.out.println("increase the salary by 1000");
        employees.stream().map(e->e.getSalary()+1000).forEach(System.out::println);		

		System.out.println("display age greaterthan 30");
		employees.stream().filter(e->e.getAge()>30).forEach(System.out::println);
		
		System.out.println("increase the salary by 1000");
        employees.stream().map(e->e.getName()+" "+e.getDept() +" "+ (e.getSalary()+1000)+" "+e.getAge()).forEach(System.out::println);		
        
        
    	System.out.println("employee name upper case");
        employees.stream().map(e->e.getName() +" "+ e.getName().length() +" "+ e.getName().toUpperCase()).forEach(System.out::println);
	}

	}
