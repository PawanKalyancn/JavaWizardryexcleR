package javaday14newfeature;
interface Eat
{
	void breakfate();
}
class hotel
{
	void buybreakfast()
	{
		System.out.println("pay for the orde r ,eat idly");
	}
}
public class Methodreferncedemo3 {

	public static void main(String[] args) {
//lamdaexpreesion IMPLEMENTATION
		Eat eat =()->{
			System.out.println("preparing idly");
		System.out.println("eating idly");
		};
		
		eat.breakfate();
		
		
 System.out.println("-----");
	     
	     hotel Hotel = new hotel();
	     //METHOD REFERENCE IMPLAMENTATION
	     Eat eat2 = Hotel::buybreakfast;
	     eat2.breakfate();
	     
	}

}
