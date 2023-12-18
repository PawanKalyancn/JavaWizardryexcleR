package javaday12Stringhandleing;

public class Removethevowels {

	public static void main(String[] args) {
		 
		String withoutvowels="";
		 String msg ="welcome to java";
		 
		    for(int i =0;i<msg.length();i++)
			{
				char ch=msg.charAt(i);
				if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')
				{
					withoutvowels =withoutvowels +ch;
					//System.out.println("the charyeters ar" + ch);
				}
			}
				System.out.println(withoutvowels);
			}
	}
