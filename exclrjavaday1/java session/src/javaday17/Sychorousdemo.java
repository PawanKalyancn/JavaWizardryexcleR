package javaday17;

class Waterbottle
{
	synchronized void drink(int sip)
	{
	 for (int i = 0; i < sip; i++) {
		 
		 
		System.out.println(Thread.currentThread().getName()+"is drink"+i +"sip");
	}	
	}
}
 
class Drink implements Runnable
{
	Waterbottle bottle  = new Waterbottle();
	
	@Override
	public void run() {
		bottle.drink(5);
	}
	
}



public class Sychorousdemo {

	public static void main(String[] args) {
		Drink drink =new Drink();
		Thread  person1 =  new Thread(drink);
		Thread  person2 =  new Thread(drink);
		Thread  person3 =  new Thread(drink);
		Thread  person4 =  new Thread(drink);
		person1.setName("pawan");
		person2.setName("world");
		person3.setName("helllo");
		person4.setName("abd");
		person1.start();

		person2.start();
		person3.start();
		person4.start();
		
	}

}
