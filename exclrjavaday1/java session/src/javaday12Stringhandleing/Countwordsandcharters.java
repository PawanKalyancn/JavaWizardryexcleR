package javaday12Stringhandleing;

public class Countwordsandcharters {

	public static void main(String[] args) {
		String msg ="pawan kalyan cn";
		int wordcount=1;
		int charcout =0;
		for(int i=0;i<msg.length();i++)
		{
			char ch =msg.charAt(i);
			if(ch==' ')
			{
				wordcount++;
			}
			else
			{
				charcout++;
			}
		}
		
		System.out.println("word count :"+wordcount);
		System.out.println("char count :"+charcout);
	}

}
