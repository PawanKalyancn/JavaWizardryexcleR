package clgjavaprep;

public class Construtordemo {
	
	//Construtordemo(){
		//System.out.println("NO argument constuctor");
//	}
	
	//constructor is non static member
		//is use to  load the object
		//it shd have same as class name
		//2 types parametric constructor and no argument constructor

		//concpet of inhertance
		//defalut consturctor will be assinged if user doest set any data its alwasys snd a No argument construtor

		//this stament is used to get  data within the same class
		//super will be used to get or set data with ither classs
	Construtordemo(){
		this(10);
		System.out.println(" 11");
	}
	
	
	Construtordemo( int a){
		System.out.println("this method with 10");
		System.out.println("parametic constuctor");
		System.out.println("vaalue is "+a);
	}
	
	Construtordemo( String a){
		System.out.println("parametic constuctor");
		System.out.println();
	}
	Construtordemo( int a ,int b){//overloading 
		System.out.println("parametic constuctor");
		System.out.println("vaalue is "+a);
		System.out.println("vaalue is "+b);
		int c=a+b;
		System.out.println(c);

	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//calling the constructor
		Construtordemo cd=new Construtordemo();
		System.out.println(cd);
		
		Construtordemo cd1=new Construtordemo(); 
		
		Construtordemo cd2=new Construtordemo(); //evry time we create an obj there will b excutionn of the constructor 

		Construtordemo cd3=new Construtordemo(10);//parametriconstrtor
		
		Construtordemo cd4=new Construtordemo(10,90);
		
		Construtordemo cd5=new Construtordemo("hello");//parametriconstrtor

		Methodanditstypes.hai();//getting  method from other class 

	}
	
  
}
