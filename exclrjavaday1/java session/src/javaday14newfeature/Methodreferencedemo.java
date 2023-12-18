package javaday14newfeature;
@FunctionalInterface
interface Test
{
	void display();
}
class Person
{
	static void showMeassage()
	{
		System.out.println( "thsi is person info");
	}
	static  void showMeassage2()
	{
		System.out.println("hell9 eworld ");
	}
}

//:: is the method reference colon symbol
public class Methodreferencedemo {

	public static void main(String[] args) {
		Test test = Person :: showMeassage;
		test.display();
		Test test2 = Person::showMeassage2;
		test2.display();
		Test t = ()->System.out.println("this is lamda impl");
		t.display();
	}

}
