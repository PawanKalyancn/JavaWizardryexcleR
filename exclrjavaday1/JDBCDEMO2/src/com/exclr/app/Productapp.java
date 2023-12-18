package com.exclr.app;
import java.util.ArrayList;
	import java.util.Scanner;
     import com.exclr.database.*;
	import com.exclr.model.*;

	public class Productapp {
		public static void main(String[] args) throws Exception {

			
		
			ProductCRUDoperations productCrud = new ProductCRUDoperations();
			
			try (Scanner scanner = new Scanner(System.in)) {
				String choice="yes";
				while(choice.equalsIgnoreCase("yes"))
				{
				  System.out.println("press 1.add product \n 2.view all product ");
				    int ch =scanner.nextInt();
				    if(ch==1)
				    {
				    	System.out.println("enter id ");
				    	int id = scanner.nextInt();
				    	
				    	System.out.println("enter name");
				    	String name = scanner.next();
				    	
				    	System.out.println("enter category");
				    	String category = scanner.next();
				    	
				    	System.out.println("enter price ");
				    	int price = scanner.nextInt();
				    	
				    	System.out.println("enter quantity ");
				    	int quantity = scanner.nextInt();
				    
						
				    	PRODUCT product = new PRODUCT(id, name, category,price, quantity);
						

				    	System.out.println(productCrud.addProduct(product));
				    }
				    if(ch==2)
				    {
				    	ArrayList<PRODUCT> products =  productCrud.reteriveAllProduct();
				    	for(PRODUCT product :products)
				    	{
				    		System.out.println(product.getId() +" "+ product.getName() +" "+ product.getCategory() +" "+ product.getPrice() +" "+ product.getQuantity());
				    	}
				    }
				    	
				    System.out.println("do you want to continue..type yes");
				    choice=scanner.next();
					
				}
			}
			
			
			
			
			
			
			
		}

	}
