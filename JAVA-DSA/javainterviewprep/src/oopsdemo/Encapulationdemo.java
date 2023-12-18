package oopsdemo;

public class Encapulationdemo {

	public static void main(String[] args) {
		Studentencapulation se = new Studentencapulation();
		System.out.println(se.getName());
		System.out.println(se.getId());
		
		se.setName("hero");
		se.setId(2);
		System.out.println(se.getName());
		System.out.println(se.getId());
		
	
	}
	

}
