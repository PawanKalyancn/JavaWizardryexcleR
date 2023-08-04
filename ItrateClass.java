package javaday9;

import java.util.ArrayList;

import javaday8.Product;

public class ItrateClass { ///its iterarte collectin not a class
	public static void main(String[] args) {
		

		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"laptop", "electronics", 80000));
		products.add(new Product(2,"table", "furniture", 55000));
		products.add(new Product(3,"pendrive", "electronics", 1000));
		products.add(new Product(4,"t-shirt", "cloth", 4000));
		
	     System.out.println(products);
	     
	     System.out.println("------------------");
	     
	     for(Product product : products)
	    	 System.out.println(product);
	     
	     for(Product product :products)
	     {
	    	 if(product.category.equals("eletronics"))
	   System.out.println(product.category );
	     }

	}
	

}
