package javaday17;

class User{    
int balance=10000;    
    
synchronized int withdraw(int amount){    
      System.out.println("going to withdraw...");    
    
    if(balance<amount){    
        System.out.println("Less balance; waiting for deposit...");    
     try{
    	 wait();}catch(Exception e){}    
     }    
    balance-=amount;    
   System.out.println("withdraw completed...");  
   return balance;
  } 


    
synchronized int deposit(int amount){    
System.out.println("going to deposit...");    
balance+=amount;    
System.out.println("deposit completed... ");    
notify();   
return balance;
}    
}

public class INTERTHREADCOMMUNICATIONDEMO {

	public static void main(String[] args) {
	final User user = new User();
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("after withdraw balance ="+ user.withdraw(5000));
				
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("after deposit balance ="+ user.deposit(10000));
			}
		};
		
		t1.setName("withdraw");
		t2.setName("deposit");
		
		t1.start();
		t2.start();
	}

}
