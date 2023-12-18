package javaday12Stringhandleing;

public class Removetheduplicatecharacters {

	public static void main(String[] args) {
		String withoutduplictaes="";
		 //String msg ="welcome to java";
		 String msg ="pawan kalyan cn";

		 for(int i =0; i<msg.length();i++)
		  {
			  char ch=msg.charAt(i);
		  if(ch!=' ')
		  {
			  withoutduplictaes =withoutduplictaes+ch;
			  msg=msg.replace(ch, ' ');
		  }
		
	}
		 System.out.println(withoutduplictaes);
		   
	}
	
	
}
