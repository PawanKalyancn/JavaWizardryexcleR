package day3java;
import java.util.Scanner;
public class fordemo2 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("enter the table name");
			int tablename = obj.nextInt();
			System.out.println("enter the table size");
			int tablesize = obj.nextInt();
			
			for (int i =0;i<=tablesize;i++)
			{
				System.out.println(tablename+"*"+i+"="+(tablename*i));
			}
		}
		
	}

}
