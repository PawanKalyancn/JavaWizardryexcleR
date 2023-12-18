package com.Assignment.service;

import java.util.List;

import com.Assignment.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	String deleteEmployee(int id);
	String updateEmployee(int id, Employee employee);
	
	
}
