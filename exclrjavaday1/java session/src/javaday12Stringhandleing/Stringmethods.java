package javaday12Stringhandleing;

public class Stringmethods {

	public static void main(String[] args) {
		String name ="pawan";
		System.out.println("lenght :" +name.length());
		System.out.println("index of a"+name.indexOf('a'));
		System.out.println("char at 3" +name.charAt(3));
		System.out.println("equals :"+name.equals("pawan"));
		System.out.println("equals :"+name.equals("PAWAN"));
		System.out.println("equals  WITH INGNORE CASE :"+name.equalsIgnoreCase("PAWAN"));

		System.out.println("UPPERCASE :"+name.toUpperCase());
		System.out.println("lowercase :"+name.toLowerCase());
		System.out.println("substr with starting index "+name.substring(1));
		System.out.println("substr with starting index and ending index "+name.substring(1,4));



	}

}
