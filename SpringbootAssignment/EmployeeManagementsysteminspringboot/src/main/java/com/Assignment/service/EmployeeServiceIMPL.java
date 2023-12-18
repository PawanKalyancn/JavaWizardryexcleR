package com.Assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.entity.Employee;
import com.Assignment.exception.IdNotFoundException;
import com.Assignment.exception.InValidSalaryException;
import com.Assignment.repository.EmployeeRepository;
import com.Assignment.utility.AppConstant;

@Service
public class EmployeeServiceIMPL  implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		if(employee.getSalary()<30000) {
			throw new InValidSalaryException(AppConstant.INAVLID_SALARY_EXCEPTION);

		}
		 Employee emp=employeeRepository.save(employee);
			return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {

		Optional<Employee> optionalEmployee =  employeeRepository.findById(id);
		  Employee employee=null;
		  
		  if(optionalEmployee.isPresent())
		   {
			   employee= optionalEmployee.get();
		   }
		  else
		  {
			  throw  new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		  }
			
			return employee;
		
	}	

	@Override
	public String deleteEmployee(int id) {
		String msg="";
		   if(employeeRepository.existsById(id))
		   {
			   employeeRepository.deleteById(id);
			   msg="employee deleted";
		   }
		   else
		   {
			   throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		   }
		
		return msg;
	}
	
	

	@Override
	public String updateEmployee(int id, Employee employee) {
		String msg="";
		   if(employeeRepository.existsById(id))
		   {
			    Employee emp = employeeRepository.findById(id).get();
			    emp.setName(employee.getName());
			    emp.setDepartment(employee.getDepartment());
			    emp.setSalary(employee.getSalary());
			    
			    employeeRepository.save(emp);
			    msg="product successfull updated";
			    
		   }
		   else
		   {
			   throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		   }
		return msg;
	}


}
