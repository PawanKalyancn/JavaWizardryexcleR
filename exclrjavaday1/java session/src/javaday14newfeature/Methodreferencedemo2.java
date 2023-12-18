package javaday14newfeature;
interface Bank
{
	void rateOfInterest();
}
public class Methodreferencedemo2 {

	public static void main(String[] args) {
		//implementation using lamda expression
				Bank sbi = ()->System.out.println("sbi 4%");
				Bank axis = ()-> System.out.println("axis 7%");
				
			    sbi.rateOfInterest();
			    axis.rateOfInterest();
			    
			    System.out.println("---calling the static method");
			    Netnbanking.interstRate();
			    
			    System.out.println("----using method reference-----");
			    //implementation using method reference.
			    Bank kotak = Netnbanking::interstRate;
			    kotak.rateOfInterest();
			    
			    
	}

}
