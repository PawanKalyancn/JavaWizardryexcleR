package com.excler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorld {
	
	@GetMapping("/admin")
	public String message()
	{
		return "welcome admin";
	}

}