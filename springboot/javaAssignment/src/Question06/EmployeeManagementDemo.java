package Question06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EmployeeManagementSystem {
    private Map<Integer, Employee> employees;

    public EmployeeManagementSystem() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeID(), employee);
    }

    public void updateEmployee(int employeeID, String name, String department, double salary) {
        if (employees.containsKey(employeeID)) {
            Employee employee = employees.get(employeeID);
            employee.setName(name);
            employee.setDepartment(department);
            employee.setSalary(salary);
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    public void deleteEmployee(int employeeID) {
        if (employees.containsKey(employeeID)) {
            employees.remove(employeeID);
            System.out.println("Employee deleted with ID: " + employeeID);
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    public void displayAllEmployees() {
        System.out.println("List of Employees:");
        for (Employee employee : employees.values()) {
            System.out.println(employee);
            System.out.println("-------------");
        }
    }

    public Employee searchEmployee(int employeeID) {
        if (employees.containsKey(employeeID)) {
            return employees.get(employeeID);
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
            return null;
        }
    }
}

public class EmployeeManagementDemo {

	public static void main(String[] args) {
		 EmployeeManagementSystem ems = new EmployeeManagementSystem();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Employee Management System Menu:");
	            System.out.println("1. Add an Employee");
	            System.out.println("2. Update Employee Details");
	            System.out.println("3. Delete an Employee");
	            System.out.println("4. Display All Employees");
	            System.out.println("5. Search for an Employee");
	            System.out.println("6. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int empID = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Department: ");
	                    String department = scanner.nextLine();
	                    System.out.print("Enter Salary: ");
	                    double salary = scanner.nextDouble();
	                    scanner.nextLine(); // Consume newline

	                    Employee newEmployee = new Employee(empID, name, department, salary);
	                    ems.addEmployee(newEmployee);
	                    break;
	                case 2:
	                    System.out.print("Enter Employee ID to Update: ");
	                    int updateEmpID = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter New Name: ");
	                    String newName = scanner.nextLine();
	                    System.out.print("Enter New Department: ");
	                    String newDepartment = scanner.nextLine();
	                    System.out.print("Enter New Salary: ");
	                    double newSalary = scanner.nextDouble();
	                    scanner.nextLine(); // Consume newline

	                    ems.updateEmployee(updateEmpID, newName, newDepartment, newSalary);
	                    break;
	                case 3:
	                    System.out.print("Enter Employee ID to Delete: ");
	                    int deleteEmpID = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline

	                    ems.deleteEmployee(deleteEmpID);
	                    break;
	                case 4:
	                    ems.displayAllEmployees();
	                    break;
	                case 5:
	                    System.out.print("Enter Employee ID to Search: ");
	                    int searchEmpID = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline

	                    Employee searchedEmployee = ems.searchEmployee(searchEmpID);
	                    if (searchedEmployee != null) {
	                        System.out.println("Employee Details:");
	                        System.out.println(searchedEmployee);
	                    }
	                    break;
	                case 6:
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please select 1, 2, 3, 4, 5, or 6.");
	            }
	        }
	    }
	}
