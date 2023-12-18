package javaday13java8newfeature;
class Parent2
{
	void phone()
	{
		System.out.println("samsung");
	}

	public void test() {
		// TODO Auto-generated method stub
		
	}
}
public class AnomysClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 par = new Parent2();
		par.phone();
//without useing the extend we can override		
		Parent2 parent2 = new Parent2() // ***anamoyos we dont add semicoln***
		{
			void phone()
			{
				System.out.println("nokia");
			}
		
			public void test() // we can add add methods
			{
				System.out.println("this is test");
			}
		};//we add here
		System.out.println("-----------anmoyos function----------");
		parent2.phone();
		parent2.test();
	}

}
