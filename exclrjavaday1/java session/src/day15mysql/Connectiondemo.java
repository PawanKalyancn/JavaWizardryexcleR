package day15mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Connectiondemo {

	public static void main(String[] args) {
		String USERNAME = "root";
		String PASSWORD = "*Pawan136";
	 String URL = "jdbc:mysql://localhost:3306/demodb";
		try {
			//step 1 load tbe driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
			
			//step-2
			//estab;ish the cONNECTION
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("conncetion established");
		
			//step 3 
			//create the statetement object
			   Statement	statement =  con.createStatement();
			statement.execute("insert into demodb.employee values(2,'pawan','Ceo',90000);");
			statement.execute("insert into demodb.employee values(3,'kalyan','develpoer',90000);");

			System.out.println("insterted");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
