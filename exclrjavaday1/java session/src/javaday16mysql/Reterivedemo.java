package javaday16mysql;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Reterivedemo {

	public static void main(String[] args) {

		try
		{
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");
			
		//step-2
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "*Pawan136");
		System.out.println("connected ");
		
			//step 3:-
		     Statement stmt = (Statement) conn.createStatement();
		     
		ResultSet rs = (ResultSet) stmt.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getInt(4));
		}
		     
			
			
			
			
		}
		catch (Exception e) {
		}
	}
	
	
	
	
	}
