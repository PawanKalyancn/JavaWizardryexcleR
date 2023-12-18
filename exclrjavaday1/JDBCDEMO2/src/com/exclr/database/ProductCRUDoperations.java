package com.exclr.database;
import com.exclr.model.PRODUCT;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	public class ProductCRUDoperations

	{
		
		//STATIC METHOD
		
		public String addProduct(PRODUCT product) throws Exception
		{
		    Connection con =	DBconction.connect();
		PreparedStatement ps=  con.prepareStatement("insert into product values(?,?,?,?,?)");
		ps.setInt(1, product.getId());
		ps.setString(2, product.getName());
		ps.setString(3, product.getCategory());
		ps.setInt(4, product.getPrice());
		ps.setInt(5, product.getQuantity());
	     
		ps.execute();
			    
			return "product added";
		}
		
		
		
		
	//DYNAMICMETHOD	
		
		
		public ArrayList<PRODUCT> reteriveAllProduct() throws Exception
		{
			ArrayList<PRODUCT> products = new ArrayList<>();
			
			 Connection con =	DBconction.connect();
			PreparedStatement ps = con.prepareStatement("select * from product ");
		    ResultSet rs= ps.executeQuery();
		    
		    while(rs.next())
		    {
		        products.add(new PRODUCT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
		    }
			
			
			return products;
		}
	}


