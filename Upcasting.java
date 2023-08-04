package com.excelar.day6.oops;

class RBI2
{
	void rateOfInterest()
	{
		System.out.println("3% rbi interest");
	}
	
	void holiday()
	{
		System.out.println("2nd and 4th satrurday is holiday");
	}
}


class Axis extends RBI2
{
	void rateOfInterest()
	{
		System.out.println("6% axis interest");
	}
	
	void axisNewPolicy()
	{
		System.out.println("to open an account no need of pan");
	}
	
}





public class Upcasting {

	public static void main(String[] args) {

		Axis axis = new Axis();   // it has access to both
		axis.rateOfInterest();
		axis.holiday();
		axis.axisNewPolicy();
		
		System.out.println("==================");
		
		RBI2 rbi = new Axis();  // upcasting ( child object, parent reference)
		rbi.rateOfInterest();
		rbi.holiday();
		//rbi.axisNewPolicy();
		
		
		
		
	}

}
