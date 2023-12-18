package Question4;

public class Usethreadlocalvariablestohandlethreadspecificdata {

	public static void main(String[] args) {
		        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

		        Thread thread1 = new Thread(new MyRunnable(threadLocal, "Thread 1"));
		        Thread thread2 = new Thread(new MyRunnable(threadLocal, "Thread 2"));

		        thread1.start();
		        thread2.start();
		    }
		}

		class MyRunnable implements Runnable {
		    private ThreadLocal<Integer> threadLocal;
		    private String threadName;

		    public MyRunnable(ThreadLocal<Integer> threadLocal, String threadName) {
		        this.threadLocal = threadLocal;
		        this.threadName = threadName;
		    }

		    @Override
		    public void run() {
		        // Set thread-specific data
		        threadLocal.set(threadLocal.get() + 1);

		        // Access and print thread-specific data
		        System.out.println(threadName + ": Thread-local value = " + threadLocal.get());

		        // Remove the thread-specific data (optional)
		        threadLocal.remove();
		    
	}

}
