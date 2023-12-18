package javaday13java8newfeature;

import java.util.function.Predicate;

public class Predicatedemo {

	public static void main(String[] args) {
//its is boolean function
		//test is inbulitmethod
		Predicate<Integer>checkelgible = (age)->
		{
			if(age>18)
				return true;
						return false;
		};
		
	System.out.println(checkelgible.test(6));
	
//tocheck the length of the name and snd true or false
	Predicate<String> p2 = (name) ->name.length()>5;
	System.out.println(p2.test("pawan"));
	System.out.println(p2.test("kalyan"));

	}

}
