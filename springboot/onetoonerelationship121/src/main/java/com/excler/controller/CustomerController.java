package com.excler.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.excler.entity.Customer;
import com.excler.services.CustomerServices;

	@RestController
	@RequestMapping("api/v1")
	public class CustomerController {

		@Autowired
		CustomerServices customerService;
		
		@PostMapping("/customer")
		ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
		{
			return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.OK);
		}
	   	
		@GetMapping("/customer")
		ResponseEntity<List<Customer>> getAllCustomer(@RequestBody Customer customer)
		{
			return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK);
		}
		
	}
