package javaday16;


		class Omkar extends Thread
		{
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("-------omkar-- ="+ i);
				}
			}
		}

		class Sakshi extends Thread
		{
			public void run()
			{
				for(int i=11;i<=20;i++)
				{
					System.out.println("---Sakshi------ ="+ i);
				}
			}
		}

		class Rohit extends Thread
		{
			public void run()
			{
				for(int i=21;i<=30;i++)
				{
					System.out.println("-----Rohit---- ="+ i);
				}
			}
		}
		public class Multithreadingdemo {

			public static void main(String[] args) {

				Omkar omkar = new Omkar();
				Sakshi sakshi = new Sakshi();
				Rohit rohit = new Rohit();
				
				//omkar.run();
				//sakshi.run();
				//rohit.run();
				
				omkar.start();
				sakshi.start();
				rohit.start();
				
	
		
	}

}
