package day3java;

public class arraeydemo {

	public static void main(String[] args) {

				//first way   ( array declation)
				int marks[] = new int [5]; // array variable of size 5
				
				marks[2]=34;   // array initilization
				marks[0]=21;
				
				for(int i=0;i<marks.length ;i++)
				{
					System.out.println(marks[i]);
				}
				
				
				
				//second way    (array declaration + initilization)
				String fruits[]= {"apple","banana","mango"};
				
				for(int i=0;i<fruits.length ;i++)
				{
					System.out.println(fruits[i]);
				}
				
				int a[]= {1,3,4};
				int sum =0;
				for(int i=0;i<a.length;i++)
				{
					sum=sum+a[i];
				}
				System.out.println("sum="+sum);
	}
	

}
