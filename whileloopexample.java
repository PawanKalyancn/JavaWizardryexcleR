package day3java;
import java.util.Scanner;
public class whileloopexample {

	public static void main(String[] args) {
		String choice="yes";
		Scanner scan = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("enter your age ");
			int age = scan.nextInt();
			
			if(age>=18)
				System.out.println("you are eligible to vote");
			else
				System.out.println("not eligible to vote");
			
			
			System.out.println("type yes to continue,.. ");
			choice=scan.next();
		}
		
		System.out.println("you have exit..");
		
	}

}
