package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Student;
import com.excelr.exception.IdNotFoundException;
import com.excelr.exception.InValidPhonenoException;
import com.excelr.exception.InvailddeptExcpetion;
import com.excelr.exception.InvalidNameException;
import com.excelr.repository.StudentRepository;
import com.excelr.utility.AppConstant;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	


	@Override
	public Student addStudent(Student student) {
		{
			while(student.getName().isEmpty()) {
				throw new InvalidNameException(AppConstant.INVALID_NAME_EXCEPTION);
			}
			
			if(student.getDept().isEmpty()) {
				throw new InvalidNameException(AppConstant.INVALID_DEPT_EXCEPTION);
			}
			
			if(student.getPhonenum().length()!=10)
			{
				throw new InValidPhonenoException(AppConstant.INAVLID_PHONENO_EXCEPTION);
			}
			
			
		    Student std2=studentRepository.save(student);
			return std2;
		}
	}


	@Override
	public List<Student> getAllStudent() {
		
			 
			return studentRepository.findAll();

	}


	@Override
	public Student getStudentById(int id) {
		
		   Optional<Student> optionalstudent=  studentRepository.findById(id);
		  Student std=null;
		  if(optionalstudent.isPresent())
		   {
			   std= optionalstudent.get();
		   }
		  else
		  {
			//throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
			  throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		  }
		  
		  return std;

	}
		

	@Override
	public String deleteStudent(int id) {
		
			String msg="";
			   if(studentRepository.existsById(id))
			   {
				   studentRepository.deleteById(id);
				   msg="student deleted";
			   }
			   else
			   {
				   throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
			   }
			
			return msg;
		}

	@Override
	public String updateStudent(int id, Student student) {
		
			String msg="";
			   if(studentRepository.existsById(id))
			   {
				    Student std = studentRepository.findById(id).get();
				    std.setName(student.getName());
				    std.setDept(student.getDept());
				    std.setPhonenum(student.getPhonenum());
				    
				    studentRepository.save(std);
				    msg="student successfull updated";
				    
			   }
			   else
			   {
				   throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
			   }
			return msg;
		}


	@Override
	public List<Student> findByName(String name) {
		 List<Student> student = studentRepository.findByName(name);
	    if (student != null) {
	        return student;
	    } else {
	        throw new  InvalidNameException(AppConstant.INVALID_NAME_EXCEPTION);
	    }
	}

	@Override
	public List<Student> findByDept(String dept) {
	    List<Student> students = studentRepository.findByDept(dept);
	    if (!students.isEmpty()) {
	        return students;
	    } else {
	        throw new InvailddeptExcpetion(AppConstant.INVALID_DEPT_EXCEPTION);
	    }
	}

	
}