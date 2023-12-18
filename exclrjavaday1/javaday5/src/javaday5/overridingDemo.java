package javaday5;

class Parent
{
	void breakfast()
	{
		System.out.println("idly");
	}
	
	
}

class Child extends Parent
{
	
	//void breakfast()
	//{
		//System.out.println("dosa");
	//}
   
}
public class overridingDemo {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
		
		
	}

}