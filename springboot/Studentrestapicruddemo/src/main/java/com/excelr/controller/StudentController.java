package com.excelr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Student;
import com.excelr.service.StudentService;



@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/Student")
	public ResponseEntity<Student> addStudent(@RequestBody Student product)
	{
		return new ResponseEntity<Student>(studentService.addStudent(product), HttpStatus.OK);
		
	}
	
	@GetMapping("/Student")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}
	
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id)
	{
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/Student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id)
	{
		return new ResponseEntity<String>(studentService.deleteStudent(id), HttpStatus.OK);
	}
	 
	@PutMapping("/Student/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable int id, @RequestBody Student student)
	{
		return new ResponseEntity<String>(studentService.updateStudent(id, student), HttpStatus.OK);
	}
	
	@GetMapping("/Student/getbyname/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable String name)
	{
		return new ResponseEntity<List<Student>>(studentService.findByName(name), HttpStatus.OK);
	}
	
	@GetMapping("/Student/getbydept/{dept}")
	public ResponseEntity<List<Student>>getStudentByDept(@PathVariable String dept)
	{
		return new ResponseEntity<List<Student>>(studentService.findByDept(dept), HttpStatus.OK);
	}
	
}
