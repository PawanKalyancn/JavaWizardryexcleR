package coludcomputingbootcamp;

import java.util.Scanner;

//hav to create own program useing ral world example
public class UniquePrg {

	public static void ExamEligbel(int percentage) {
		if(percentage>=85) {
			System.out.println("hod:take ur hall ticket go write ur exam");
		}
		else {
			if(percentage<=65)
			System.out.println("hod:go bring ur parents");
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("student:ma'am hallticket");
		System.out.println("hod:tell ur attendce percentage ");

		Scanner s = new Scanner(System.in);
		int percentage = s.nextInt();
	//	System.out.println(percentage);
		ExamEligbel(percentage);
	}

}
