package javaday13java8newfeature;
interface Operation
{
	int calculation(int a,int b);
}
public class Lamdaexprssiondemo2 {

	public static void main(String[] args) {

		Operation add =(a,b)->a+b;
		Operation mul =(a,b)->a*b;
		Operation div =(a,b)->a/b;
		Operation sub =(a,b)->a-b;

		System.out.println("addition :"+add.calculation(2, 4));
		System.out.println("substraction :"+ sub.calculation(2, 4));
		System.out.println("multiplication :"+mul.calculation(2, 4));
		System.out.println("divion :"+div.calculation(2, 2));

		
	}

}
