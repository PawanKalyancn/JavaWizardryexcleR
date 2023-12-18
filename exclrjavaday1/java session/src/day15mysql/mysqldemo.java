package day15mysql;

import java.sql.DriverManager;

public class mysqldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	String url="jdbc:mysql://WPR:3306/empdata";
	  String username="root";
	  String password="*Pawan136";
	  
	  try 
	  {
	   //step -1:-
	   //Class.forName("com.excelr.day15.A");
	   Class.forName("com.mysql.jdbc.Driver");
	   System.out.println("class found");
	   
	   //step-2
	   //establish the connection
	   DriverManager.getConnection(url, username, password);
	   
	   
	   
	  } 
	  catch (Exception e) {
	   e.printStackTrace();
	  }
}
	
