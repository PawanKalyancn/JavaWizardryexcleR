package javaday5;
//Inheritance concept
class Parent2
{
	int a=1;
}

class Child2 extends Parent2
{
	int a=2;  // global
	
	void display()
	{
		int a =3;   // local
		
		System.out.println("value of a :"+ super.a);
		System.out.println("value of a :"+ this.a);
		System.out.println("value of a :"+ a);

	}
}
public class Supervaribledemo {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.display();
		
	}

}
