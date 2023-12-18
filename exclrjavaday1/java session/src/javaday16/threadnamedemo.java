package javaday16;
class Eating extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +" "+ i);
		}
	}
}

class Writing extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() +" "+ i);
		}
	}
}


public class threadnamedemo {

	public static void main(String[] args) {
		Eating eating = new Eating();
		Writing writing = new Writing();
		
		eating.setName("Eating");
		writing.setName("writing");
		
		eating.start();
		writing.start();
	}

}
