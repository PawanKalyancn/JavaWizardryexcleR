package com.excelar.day6.oops;

interface Bank
{
	void greet();
}

interface Rbi 
{
	 void greet();
}

class ZeroBalanceAccount
{
	
}


class Kotak extends ZeroBalanceAccount implements Bank,Rbi
{

	@Override
	public void greet() {
		
	}


}



public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}
