package com.exclr.javaday04.oops;



class Account
{
	int accountNo;
	String accountHolderName;
	int balance;
	
	Account(int accountNo, String accountHolderName, int balance) {
		
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
      void withdraw(int amount)
      {
    	  balance-=amount;
      }
      
      void deposit(int amount)
      {
    	  balance+=amount;
      }
      
      int getBalance()
      {
    	  return balance;
      }
	
	
}



public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1001, "ravi", 5000);
		System.out.println("balance :"+ account.getBalance());
		
		account.withdraw(3000);
		System.out.println("after withdraw balance :"+ account.getBalance());
		
		account.deposit(4000);
		System.out.println("after deposit balance :"+ account.getBalance());
		
		account.deposit(4000);
		System.out.println("after deposit balance :"+ account.getBalance());
	
	}

}
