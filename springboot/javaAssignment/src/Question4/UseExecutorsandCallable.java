package Question4;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UseExecutorsandCallable {

	public static void main(String[] args) {
		
		
		        // Create an executor service with a fixed number of threads
		        ExecutorService executorService = Executors.newFixedThreadPool(2);

		        // Create Callable tasks
		        Callable<Integer> task1 = new MyCallable(10);
		        Callable<Integer> task2 = new MyCallable(20);

		        // Submit tasks to the executor service
		        Future<Integer> future1 = executorService.submit(task1);
		        Future<Integer> future2 = executorService.submit(task2);

		        // Shutdown the executor service when done
		        executorService.shutdown();

		        try {
		            // Get results from the Callable tasks
		            int result1 = future1.get();
		            int result2 = future2.get();

		            System.out.println("Result from task1: " + result1);
		            System.out.println("Result from task2: " + result2);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}

		class MyCallable implements Callable<Integer> {
		    private int inputValue;

		    public MyCallable(int inputValue) {
		        this.inputValue = inputValue;
		    }

		    @Override
		    public Integer call() throws Exception {
		        // Simulate a time-consuming computation
		        Thread.sleep(2000);
		        return inputValue * 2;
		    

	}

}
