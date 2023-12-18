package javaday12Stringhandleing;

public class Immutabledemo {

	public static void main(String[] args) {

String name = "anil";
		
	System.out.println(name);
		
	System.out.println("-------inside print stmt---------");
     System.out.println(name.concat(" kumar 1"));
    System.out.println(name);
		
		System.out.println("-------changing the object---------");
		name.concat(" kumar 2");// immutable it will not change
		System.out.println(name);
		
		System.out.println("-------assign to the variable---------");
		name=name.concat("kumar 3");
		System.out.println(name);
		System.out.println(name);		
		
		
		
		
		
	}

}
