package com.exclr.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconction {

	public static Connection connect() throws Exception
	{
		
		 Class.forName(DBProperties.DRIVER_CLASS);
		
		Connection con=DriverManager.getConnection(DBProperties.URL, DBProperties.USERNAME, DBProperties.PASSWORD);
		
	     return con;
		
	}
}