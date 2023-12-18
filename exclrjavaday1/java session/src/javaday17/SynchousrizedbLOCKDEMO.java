package javaday17;
class GreetingS
{
	 public  void greet(int times)
	 {
		 
		  synchronized (this) {
			  for(int i=1;i<=times;i++)
				{
				    
					System.out.println(Thread.currentThread().getName() +" is greeting "+ i);
				}
	         }
            
             
             for(int i=1;i<=times;i++)
 			{
 				System.out.println(Thread.currentThread().getName() +" is gifting "+ i);
 			}
              
	 }
}



class MarriageS extends Thread
{
	Greeting greeting = new Greeting();
	public void run()
	{
		greeting.greet(5);
	     	
	}
	
}







		
public class SynchousrizedbLOCKDEMO {

	public static void main(String[] args) {
MarriageS marriage = new MarriageS();
		
		Thread person1 = new Thread(marriage);
		Thread person2 = new Thread(marriage);
		
		person1.setName("anil");
		person2.setName("manish");
		
		person1.start();
		person2.start();
		
		
		
		
	}

}
