package oopsdemo;

public class Account 
	{
		String name;
		int ACCNO;
		double balance;
		
	
		public Account(String name, int aCCNO, double balance)
		{	  	
			super();
			this.name = name;
			ACCNO = aCCNO;
			this.balance = balance;
		}

		public  void Accountdetails() 
		{
	
			System.out.println("name :"+name);
			System.out.println("acc no:"+ACCNO);
			System.out.println("balance:"+balance);

			System.out.println("==========");

		}

		public static void main(String[] pk)
		{
 
		Account ac = new Account("pawan",10,10);
		ac.Accountdetails();
		}

}
