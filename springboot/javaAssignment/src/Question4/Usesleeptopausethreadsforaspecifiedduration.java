package Question4;

public class Usesleeptopausethreadsforaspecifiedduration {

	public static void main(String[] args) {
		        Thread thread1 = new MyThread2("Thread 1");
		        Thread thread2 = new MyThread2("Thread 2");

		        thread1.start();
		        thread2.start();
		    }
		}

		class MyThread2 extends Thread {
		    public MyThread2(String name) {
		        super(name);
		    }

		    @Override
		    public void run() {
		        for (int i = 1; i <= 5; i++) {
		            System.out.println(getName() + " is running. Iteration " + i);
		            
		            // Pause the thread for 1 second (1000 milliseconds)
		            try {
		                Thread.sleep(1000);
		            } catch (InterruptedException e) {
		                Thread.currentThread().interrupt();
		            }
		        }
		    }
		}