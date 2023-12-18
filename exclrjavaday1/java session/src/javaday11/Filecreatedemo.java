package javaday11;

import java.io.File;
import java.io.IOException;

public class Filecreatedemo {

	public static void main(String[] args) throws IOException {

		File file = new File("abc1.txt");
		//System.out.println( "for checking th file existiances :"+file.exists())
		//file.createNewFile();
	//System.out.println( "for checking th file existiances :"+file.exists());
	if(file.exists())
	{
		System.out.println("film is alredy present");
	}
	
	else
	{
		file.createNewFile();
		System.out.println("new file created");
	}
	
	}

}
