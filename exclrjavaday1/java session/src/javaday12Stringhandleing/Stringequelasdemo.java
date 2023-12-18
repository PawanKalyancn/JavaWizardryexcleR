package javaday12Stringhandleing;

public class Stringequelasdemo {

	public static void main(String[] args) {

String s1 ="hello";
String s2 ="hello";



String s3 =new String("hello");

String s4 =new String("hello");

	System.out.println("-----useing == ----------");
	System.out.println("s1==s2"+(s1==s2));
	System.out.println("s3==s4"+(s3==s4));//bcx "== " checks evn the memory loaction
	
	System.out.println("------using equals------");
	System.out.println("s1==s2"+(s1.equals(s2)));
	System.out.println("s3==s4"+(s3.equals(s4)));

	}

}
