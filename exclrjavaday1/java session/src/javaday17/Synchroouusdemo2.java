package javaday17;
class Greeting
{
	 public synchronized void greet(int times)
	 {
             for(int i=1;i<=times;i++)
			{
				System.out.println(Thread.currentThread().getName() +" is greeting"+ i);
			}
	 }
}



class Marriage extends Thread
{
	Greeting greeting = new Greeting();
	public void run()
	{
		greeting.greet(5);
	     	
	}
	

}
public class Synchroouusdemo2 {

	public static void main(String[] args) {
		Marriage marriage = new Marriage();
		
		Thread person1 = new Thread(marriage);
		Thread person2 = new Thread(marriage);
		
		person1.setName("anil");
		person2.setName("manish");
		
		person1.start();
		person2.start();
		
	}

}
