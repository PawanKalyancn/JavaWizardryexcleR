package com.excler.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excler.entity.Customer;
import com.excler.repository.AddressRespotary;
import com.excler.repository.CustomerRespository;

@Service
public class CustomerServices{
	
	@Autowired
	AddressRespotary addressRespotary;
	
	@Autowired
	CustomerRespository customerRepository;
	
	public Customer addCustomer(Customer customer)
	{
		Customer customer2=    customerRepository.save(customer);
		return customer2;
	}
	
	public List<Customer> getAllCustomer()
	{
		return customerRepository.findAll();
	}
	
}

