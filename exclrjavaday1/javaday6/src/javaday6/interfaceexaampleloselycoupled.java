package javaday6;
interface Bank
{
	void greet1();
}

interface Rbi 
{
	 void greet2();
}

class ZeroBalanceAccount
{
	
}


class Kotak extends ZeroBalanceAccount implements Bank,Rbi
{

	@Override
	public void greet1() {
		System.out.println("helloo worls drd");
	}

	@Override
	public void greet2() {
		// TODO Auto-generated method stub
		
	}

}

public class interfaceexaampleloselycoupled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank= new Kotak();
		bank.greet1();
		
	}

}