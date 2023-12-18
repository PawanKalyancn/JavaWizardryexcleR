package javaday12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriterdemo {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write("rahul");
		bw.newLine();
		bw.write("manish");
		bw.newLine();
		bw.write("rohit");
		bw.newLine();
		bw.write("pawan");
		bw.newLine();
		System.out.println("data is snt"
				+ "");
		
		bw.flush();
		bw.close();
		}

}
//fillewriter will write letter by letter where as here this it will write word by word