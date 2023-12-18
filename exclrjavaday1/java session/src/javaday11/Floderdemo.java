package javaday11;

import java.io.File;

public class Floderdemo {

	public static void main(String[] args) {
		
		File file = new File("movies");
		 if (file.exists())
		 {
			 System.out.println("efile is already presnt");
		 }
		 
		 else
		 {
		file.mkdir();//is used to create floder
		System.out.println("floder created..");
			 
		 }
	}

}
