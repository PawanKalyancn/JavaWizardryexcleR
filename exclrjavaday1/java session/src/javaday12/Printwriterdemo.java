package javaday12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriterdemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("hello3.txt");
		pw.write(100);
		pw.print(100);
		pw.write("safan");
		pw.print(23);
		
		
		pw.flush();
		pw.close();
		
	}

}
