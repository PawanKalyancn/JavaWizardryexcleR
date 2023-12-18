package clgjavaprep;

public class MethodOverloading {
	
	//Creating more methods using single method name is called  as method overloading
	//this topic comes under polymoruism
	
	public static void add(int a,int b) { // with void method
		
	int c=a+b;
	System.out.println(c);
	}
	
	public static int add1(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
		return c;
		}
	//we dont want return anything we use void
	//we want to return we must use retun keyword use other like int,flot,double
	
	
	//overriding means taking method from other class
	
public static int add1(int a,int b,int c) { //with int method
		
		int d=a+b+c;
		System.out.println(d);
		return d;

		}
	
	public static void add(int a,int b,int c) {
		
		int d=a+b+c;
		System.out.println(d);
		}
	

	public static void main(String[] args) {

		
		
		add(1,2);
		add(1,2,3);
		
		int a =add1(10,10);
		int b=add1(10,20,30);
		int c=a+b;
		System.out.println(c);
	}

}
