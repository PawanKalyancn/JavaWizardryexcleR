package javaday16;

class Manoj extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("-------manoj-- ="+ i);
		}
	}
}

class Sourab extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("---Sourab------ ="+ i);
		}
	}
}





public class Sleeepdemo {

	public static void main(String[] args) {

		Manoj manoj = new Manoj();
		Sourab sourab = new Sourab();
		manoj.start();
		sourab.start();
	}

}
