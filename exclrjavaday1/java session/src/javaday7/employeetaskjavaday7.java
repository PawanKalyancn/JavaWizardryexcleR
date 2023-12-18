package javaday7;

import java.util.Scanner;

class Employee{
	  String firstName;
	  String lastName;
	  Employee(String firstName,String lastName){
		 
		 this.firstName=firstName;
		this.lastName=lastName;
	  }
	 public void validate() {
		 if(firstName==null || lastName==null) {
			 throw new NullPointerException("FirstName and LastName cannot be null.");
		 }
		 if(firstName.length()<4 || lastName.length()<4) {
			 throw new InvalidNameException("Username should be minimum 4 Charachters.");
		 }
	 }
	 
}

class InvalidNameException extends RuntimeException{
	 public InvalidNameException(String msg) {
	     super(msg);
	 }
}
public class employeetaskjavaday7 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First name: ");
		String firstName=sc.nextLine();
		System.out.println("Enter the lastName: ");
		String lastName=sc.nextLine();
	try {
		Employee emp=new Employee(firstName,lastName);
		emp.validate();
		System.out.println("Employee details are valid");
	}
	catch(NullPointerException e) {
		System.out.println("Error "+e.getMessage());
	}
    catch(InvalidNameException ex) {
    	System.out.println("Error"+ex.getMessage());
    }
	}

}
