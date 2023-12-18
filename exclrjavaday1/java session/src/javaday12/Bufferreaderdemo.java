package javaday12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreaderdemo {

	public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
	String line = br.readLine();
	while (line!=null)
	{
		System.out.println(line);
		line =br.readLine();
	}
	
	}

}
