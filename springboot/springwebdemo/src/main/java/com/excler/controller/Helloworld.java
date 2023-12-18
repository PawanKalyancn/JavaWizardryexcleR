package com.excler.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Helloworld {
	@GetMapping("/admin")
	public String message()
	{
		return "welcome admin";
	}
	@GetMapping("/user")
	public String message1()
	{
		return "welcome pukka";
	}
	@GetMapping("/sum")
	public int sum(int a,int b)
	{
		return a+b;
	}
}
