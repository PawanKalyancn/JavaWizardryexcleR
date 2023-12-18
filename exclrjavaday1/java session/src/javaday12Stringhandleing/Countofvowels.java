package javaday12Stringhandleing;

public class Countofvowels {

	public static void main(String[] args) {
    String msg ="welcome to java";
   
    // System.out.println("count :"+ msg.length());
	int count =0;
    for(int i =0;i<msg.length();i++)
	{
		char ch=msg.charAt(i);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') // (or means ||)
		{
			++count;
			System.out.println("vowels :" +ch);
		}
	}
		System.out.println(count);
	}

}
