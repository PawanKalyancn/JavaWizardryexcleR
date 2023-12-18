package javaday12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("hello2.txt", true);
		fw.write("hello world, welcome to java ");

		fw.flush();
		fw.close();

		FileReader fr = new FileReader("hello2.txt");

		int ch = fr.read();
		int count = 0;
		while(ch!= -1 )
		{
		if(ch == 'a')
		{
		count++;
		}
		ch=fr.read();
		}

		System.out.println(count);

		}
	}
