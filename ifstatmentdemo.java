package day3java;
import java.util.Scanner;
public class ifstatmentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is used to take user input.
				Scanner scan = new Scanner(System.in);
				
				System.out.println("enter your age ");
				int age = scan.nextInt();
				
				if(age>=18)
					System.out.println("you are eligible to vote");
				else
					System.out.println("not eligible to vote");
	}

}
