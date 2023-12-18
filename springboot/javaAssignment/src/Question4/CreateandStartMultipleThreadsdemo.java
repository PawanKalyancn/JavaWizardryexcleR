package Question4;

public class CreateandStartMultipleThreadsdemo {

	public static void main(String[] args) {

		
		        // Create and start multiple threads
		        for (int i = 1; i <= 5; i++) {
		            Thread thread = new MyThread("Thread " + i);
		            thread.start();
		        }
		    }
		}

		class MyThread extends Thread {
		    public MyThread(String name) {
		        super(name);
		    }

		    @Override
		    public void run() {
		        System.out.println(getName() + " is running.");
		    }
		}
