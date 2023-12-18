package com.exclr.app;
import java.util.ArrayList;
	import java.util.Scanner;
     import com.exclr.database.*;
	import com.exclr.model.*;

	public class Employeeapp {
		public static void main(String[] args) throws Exception {

			
		
			EmployeeCRUDoperations EmployeeCrud = new EmployeeCRUDoperations();
			
			try (Scanner scanner = new Scanner(System.in)) {
				String choice="yes";
				while(choice.equalsIgnoreCase("yes"))
				{
				  System.out.println("press 1.add employee \n 2.view all employee \n 3.Update Employee \n 4.Remove Employee");
				    int ch =scanner.nextInt();
				    if(ch==1)
				    {
				    	System.out.println("enter id ");
				    	int id = scanner.nextInt();
				    	
				    	System.out.println("enter name");
				    	String name = scanner.next();
				    	
				    	System.out.println("enter dept");
				    	String department = scanner.next();
				    	
				    	
				    	
				    	System.out.println("enter salary ");
				    	int salary = scanner.nextInt();
				    
						
				    	Employee employee = new Employee(id, name, department, salary);
						

				    	System.out.println(EmployeeCrud.addProduct(employee));
				    }
				    if(ch==2)
				    {
				    	ArrayList<Employee> employee =  EmployeeCrud.reteriveAllProduct();
				    	for(Employee employees :employee)
				    	{
				    		System.out.println(employees.getId() +" "+ employees.getName() +" "+ employees.getDepartment() +" "+ employees.getSalary());
				    	}
				    }
				    
				    if(ch==3)
				    {// Update employee
                     System.out.println("Enter the ID of the employee to update: ");
                     int updateId = scanner.nextInt();
                     scanner.nextLine(); // Consume the newline character

                     System.out.println("Enter new name (or press Enter to keep the existing name): ");
                     String newName = scanner.nextLine();

                     System.out.println("Enter new department (or press Enter to keep the existing department): ");
                     String newDepartment = scanner.nextLine();

                     System.out.println("Enter new salary (or press Enter to keep the existing salary): ");
                     String newSalaryStr = scanner.nextLine();
                     double newSalary = -1.0; // Default value to indicate no change

                     if (!newSalaryStr.isEmpty()) {
                         newSalary = Double.parseDouble(newSalaryStr);
                     }

                     Employee updatedEmployee = new Employee(updateId, newName, newDepartment, newSalary);
                     System.out.println(EmployeeCRUDoperations.updateEmployee(updatedEmployee));
				    }
				    
				    if(ch==4)
				    {
                     // Delete employee
                     System.out.println("Enter the ID of the employee to delete: ");
                     int deleteId = scanner.nextInt();
                     scanner.nextLine(); // Consume the newline character

                     System.out.println(EmployeeCRUDoperations.deleteEmployee(deleteId));
                     
          
				 }
				    	
				    System.out.println("do you want to continue..type yes");
				    choice=scanner.next();
					
				}
			}
			
			
			
		}
	}

	
