package javaday13java8newfeature;

import java.util.function.Function;

public class Functiondemo {

	public static void main(String[] args) {
		Function<String, Integer> namelenght = (name)->name.length();
		System.out.println(namelenght.apply("pawan"));
System.out.println(namelenght.apply("kalyan"));
		
	//it takes on input of any type and returns truue or false	
	
	Function<Integer, String> checkelegibality = (age)->
	{
		if(age>=18)
			return "eleigle to vote";
		return "not elegible to vote" ;
	};
	System.out.println(checkelegibality.apply(46));
	System.out.println(checkelegibality.apply(4));
	
	
	}
}
