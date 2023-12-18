package javaday7;

public class trycatchdemo2 {

	public static void main(String[] args) {
		int marks[]=new int [5];
		try 
		{
			System.out.println(2/2);
			marks[7]=68;
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException exObj)
		{
			System.out.println(exObj.getMessage());
			
		}
	
	
	
	}

}
