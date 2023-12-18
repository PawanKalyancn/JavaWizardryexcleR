package com.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
