package com.excler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excler.entity.Product;
import com.excler.repostory.Productrepository;
@SpringBootApplication
public class JpacruddemoApplication implements CommandLineRunner {
	
	@Autowired
	Productrepository productrepository;//same as object creation
	
	public static void main(String[] args) {
		SpringApplication.run(JpacruddemoApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product product = new Product(2, "phone", 444334, "accessories", 25);
Product product1 = new Product(3,"laptop", 92000, "accessories", 20);
System.out.println("printing al the products");
productrepository.save(product);

productrepository.save(product1);

		System.out.println("---find all the  products---- \n ");
	Iterable<Product> products =	productrepository.findAll();
for(Product prod : products)
	{
		System.out.println(prod);
	}
      System.out.println("---\n ");
      
      System.out.println("---find product by id ---");
      
     Product pro =    productrepository.findById(1).get();
     System.out.println("Product with for given id "+ pro);
	
		
	}

	}
