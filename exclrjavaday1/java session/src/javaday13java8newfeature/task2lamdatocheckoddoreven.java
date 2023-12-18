package javaday13java8newfeature;
interface checknumber
{
	String check(int num);
}
public class task2lamdatocheckoddoreven {

	public static void main(String[] args) {
		
		checknumber chnum = (num)->
		{
			if (num%2==0)
				return "its is even";
			else
				return "its odd";
		};
	System.out.println(chnum.check(4));
	}

}
