package Question4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Usethreadpoolstomanageagroupofthreadsefficiently {

	public static void main(String[] args) {
       // Create a thread pool with a fixed number of threads
		  ExecutorService executorService = Executors.newFixedThreadPool(3);

		  // Submit tasks to the thread pool
		        for (int i = 1; i <= 5; i++) {
		            Runnable task = new MyTask(i);
		            executorService.submit(task);
		        }

		        // Shutdown the thread pool when done
		        executorService.shutdown();
		    }
		}

		class MyTask implements Runnable {
		    private final int taskId;

		    public MyTask(int taskId) {
		        this.taskId = taskId;
		    }

		    @Override
		    public void run() {
		        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
		 
	}

}
