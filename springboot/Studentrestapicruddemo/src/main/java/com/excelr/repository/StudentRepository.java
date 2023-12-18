package com.excelr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//custum query
	List<Student> findByDept(String dept);
	
	List<Student> findByName(String name);
	
}
