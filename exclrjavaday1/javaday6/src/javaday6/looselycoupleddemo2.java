package javaday6;

interface payment
{
	void mode();
}

class gpay implements payment
{

	@Override
	public void mode() {
System.out.println("hii im doing gpay");
	}
	
}

class phonepe implements payment
{

	@Override
	public void mode() {
System.out.println("hello im doin phonepe");		
	}
	
}

public class looselycoupleddemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment paymentkaro =new gpay();
		paymentkaro.mode();
		
		payment paymentkaro1 =new phonepe();
		paymentkaro1.mode();
		
	}

}
