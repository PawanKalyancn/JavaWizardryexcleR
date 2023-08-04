package day4;


class Employee
{
	int id;   // global 
	String name;
	
	Employee(int id, String name)   // local
	{
		this.id=id;
		this.name=name;
	}
	
	
	void displayEmployeeInfo()
	{
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
	}
}



public class ParameterizedConstructor {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "sourab");
		employee.displayEmployeeInfo();
	}

}
