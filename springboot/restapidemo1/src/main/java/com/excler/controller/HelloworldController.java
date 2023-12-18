package com.excler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excler.model.OPERATION;

@RestController
public class HelloworldController {
	@GetMapping("/admin")
	public String diplay() {
		return "jai shree Ram";
	}
	@PostMapping("/add")
	public String doADD(@RequestBody OPERATION operation)
	{
		int a = operation.getNum1();
		int b= operation.getNum2();
		
		int result = a+b;
		
		return "Result of Add : "+ result;
	
	}
	@PostMapping("/sub")
	public String doSUB(@RequestBody OPERATION operation)
	{
		int a = operation.getNum1();
		int b= operation.getNum2();
		
		int result = a-b;
		
		return "Result of sub : "+ result;
	
	}
	@PostMapping("/div")
	public String dodiv(@RequestBody OPERATION operation)
	{
		int a = operation.getNum1();
		int b= operation.getNum2();
		
		int result = a/b;
		
		return "Result of div : "+ result;
	
	}
	@PostMapping("/mul")
	public String domul(@RequestBody OPERATION operation)
	{
		int a = operation.getNum1();
		int b= operation.getNum2();
		
		int result = a*b;
		
		return "Result of multpication : "+ result;
	
	}

}

