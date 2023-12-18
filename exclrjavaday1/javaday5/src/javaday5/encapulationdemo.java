package javaday5;

class Employee
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class encapulationdemo {

	public static void main(String[] args) {

		Employee emp =new Employee();
		emp.setId(1);
		emp.setName("pawan"); //we dont acces to direct class id we shd get acces from geters and setters
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	}

}
