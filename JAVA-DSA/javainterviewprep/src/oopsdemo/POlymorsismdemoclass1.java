package oopsdemo;

public class POlymorsismdemoclass1 extends polymorsismdemoclass2 {
/*
 * polymorism one name many forms
 * can be be made in 3 methods
 * 1.shadowing (ctp=complie time ploymorsim)
 * 2.overriding'(RTC=run time ploymorsim)
 * 3.overloading(ctp=complie time ploymorsim)
 * the shadowing method needs static at both the class..based on methods ..based on refernece type willb excuted
 * oveeriding is for non static members in this it uses the object ..it will excute based on tghe obkects created
 * overloading is for both  static and non static..objects but differt aerugments or data type
*/
	
	public static void virat() {
		System.out.println("im child class");
	}
	
	public static void main(String[] args) {
		polymorsismdemoclass2 pc2 =new polymorsismdemoclass2();
		pc2.virat();
		
		polymorsismdemoclass2 pc3 = new POlymorsismdemoclass1();//up-casting to access only parent class
		pc3.virat();
		
		POlymorsismdemoclass1 pc4=(POlymorsismdemoclass1)pc3;//down casting to  access only child classs
		pc4.virat();
		
		POlymorsismdemoclass1 pc5 = new POlymorsismdemoclass1();
		pc5.virat();
	
		//typecasting : converting one data type to another data type
		//1.wideing:lower data type to higher data type..no loss of data
		//2.narrowing:higher data type to  lower data type..chance of loseing the data 
	}

}
