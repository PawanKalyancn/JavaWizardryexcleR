package javaday11;

import java.io.FileReader;
import java.io.IOException;

public class Filereaderdemo {

	public static void main(String[] args) throws IOException {

		FileReader fr =new FileReader("abc.txt"); 
		int ch = fr.read();
		//System.out.println(ch);
		//ch =fr.read();
		//System.out.println(ch);
		//ch =fr.read();
	//	System.out.println(ch);
		///ch =fr.read();
	//	System.out.println(ch);
	while(ch!=-1)
	{
		System.out.print((char)ch);//for single line
		//System.out.println((char)ch); //for letter by SsSSletter print
		ch=fr.read();
	}
	}

}
