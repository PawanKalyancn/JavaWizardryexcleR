package com.excler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excler.entity.Customer;
import com.excler.repostory.Customerrepository;
@SpringBootApplication
public class JpacruddemoApplication implements CommandLineRunner {
	
	@Autowired
	Customerrepository customerrepository;//same as object creation
	
	public static void main(String[] args) {
		SpringApplication.run(JpacruddemoApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer = new Customer(3, "pk",1233455, "bangalore",5);
Customer product1 = new Customer(4,"pawankalayn", 34475748, "bengluru", 20);
System.out.println("printing al the products");
customerrepository.save(customer);

customerrepository.save(product1);

		System.out.println("---find all the  customer---- \n ");
	Iterable<Customer> customers =	customerrepository.findAll();
for(Customer prod : customers)
	{
		System.out.println(prod);
	}
      System.out.println("---\n ");
      
      System.out.println("---find customer by id ---");
      
     Customer pro =    customerrepository.findById(3).get();
     System.out.println("Product with for given id "+ pro);
	
		
	}

	}
