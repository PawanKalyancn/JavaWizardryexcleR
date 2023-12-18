package javaday13java8newfeature;

import java.awt.DisplayMode;

public interface Test {
	void test();
	
	default void Display()//child cant override
	{
		System.out.println("thois is default method");
	}
	static void sample() //chid can override
	{
		System.out.println("this is static method");
	}

}

