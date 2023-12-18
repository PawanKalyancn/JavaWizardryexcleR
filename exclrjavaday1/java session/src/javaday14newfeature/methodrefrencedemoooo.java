package javaday14newfeature;
interface Calculation
{
	int operation(int a,int b);
}


class Utility
{
	 int add(int a,int b)
	 {
		 return a+b;
	 }
	 
	 int sub(int a,int b)
	 {
		 return a-b;
	 }
}
public class methodrefrencedemoooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Utility utility = new Utility();
		
		Calculation cal1 = utility::add;
		System.out.println(cal1.operation(2, 2));
		
		Calculation cal2 = utility::sub;
		System.out.println(cal2.operation(2, 2));
	}

}
