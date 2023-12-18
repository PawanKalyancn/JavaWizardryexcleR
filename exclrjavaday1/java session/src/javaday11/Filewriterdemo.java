package javaday11;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Filewriterdemo {


	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("hello.txt );
		fw.write("helooo");
		fw.write("world");
		fw.write(27);
		fw.write("kmpd");
		fw.flush();
		fw.close();
		System.out.println("data is written in the file");
		
		
	}

}
