package day3java;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choice ="yes";
		while(choice.equals("yes"))
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter your age ");
			int age = scan.nextInt();
			
			if(age>=18)
				System.out.println("you are eligible to vote");
			else
				System.out.println("not eligible to vote");
			
		System.out.println("do yuo wnt to  continue 1.continue 2.exit");
		}
		
		
	}

}
