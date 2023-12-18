package javaday13java8newfeature;


class parent
{
	void home()
	{
		System.out.println("btm hose");
	}
}
class child extends parent //instaed of this we use anamoyus class
{
	void home()
	{
	System.out.println("hsr layput");

	}

	}
public class Overridingdemo {

	public static void main(String[] args) {
		child chi = new child();
		chi.home();
		
	}

}
