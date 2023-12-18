package javaday5;
class dad
{
	dad(int id)
	{
		System.out.println("parent constructor "+ id);
	}
}

class son extends dad
{
	son() 
	{
		super(1);
		System.out.println("child constructor");
	}
	
}




public class inhertencedemo {

	public static void main(String[] args) {
		son Son = new son();
		
		
		
	}

}
