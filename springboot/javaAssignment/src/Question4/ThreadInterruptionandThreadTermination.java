package Question4;

public class ThreadInterruptionandThreadTermination {

	public static void main(String[] args) {
		        
		Thread workerThread = new WorkerThread();
		        workerThread.start();

		        // Interrupt the worker thread after a delay
		        try {
		            Thread.sleep(2000); // Sleep for 2 seconds
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		        }

		        // Interrupt the worker thread
		        workerThread.interrupt();
		    }
		}

		class WorkerThread extends Thread {
		    @Override
		    public void run() {
		        try {
		            while (!Thread.currentThread().isInterrupted()) {
		                System.out.println("Worker thread is running.");
		                Thread.sleep(500); // Sleep for 500 milliseconds
		            }
		        } catch (InterruptedException e) {
		            System.out.println("Worker thread was interrupted.");
		            Thread.currentThread().interrupt(); // Restore the interrupted status
		        }

		        System.out.println("Worker thread is terminated.");
		    }
		}

	