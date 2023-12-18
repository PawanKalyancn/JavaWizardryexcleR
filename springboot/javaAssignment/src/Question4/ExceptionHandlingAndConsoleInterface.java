package Question4;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExceptionHandlingAndConsoleInterface {

	public static void main(String[] args) {

		        Queue<Integer> buffer = new LinkedList<>();
		        int bufferSize = 5; // Size of the shared buffer

		        Lock lock = new ReentrantLock();
		        Condition notFull = lock.newCondition();
		        Condition notEmpty = lock.newCondition();

		        Thread producerThread1 = new Thread(new Producer2(buffer, bufferSize, lock, notFull, notEmpty), "Producer 1");
		        Thread consumerThread1 = new Thread(new Consumer2(buffer, lock, notFull, notEmpty), "Consumer 1");

		        producerThread1.start();
		        consumerThread1.start();

		        // Console interface for user interaction
		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("Press 'q' to quit the program.");
		            String userInput = scanner.nextLine().trim().toLowerCase();
		            if (userInput.equals("q")) {
		                producerThread1.interrupt(); // Interrupt the producer thread to stop it
		                consumerThread1.interrupt(); // Interrupt the consumer thread to stop it
		                break;
		            }
		        }
		        scanner.close();
		    }
		}

		class Producer2 implements Runnable {
		    private final Queue<Integer> buffer;
		    private final int bufferSize;
		    private final Lock lock;
		    private final Condition notFull;
		    private final Condition notEmpty;

		    public Producer2(Queue<Integer> buffer, int bufferSize, Lock lock, Condition notFull, Condition notEmpty) {
		        this.buffer = buffer;
		        this.bufferSize = bufferSize;
		        this.lock = lock;
		        this.notFull = notFull;
		        this.notEmpty = notEmpty;
		    }

		    @Override
		    public void run() {
		        try {
		            while (!Thread.currentThread().isInterrupted()) {
		                lock.lock();
		                try {
		                    while (buffer.size() == bufferSize) {
		                        notFull.await();
		                    }

		                    int data = (int) (Math.random() * 100);
		                    buffer.offer(data);
		                    System.out.println(Thread.currentThread().getName() + " produced: " + data);
		                    notEmpty.signalAll();
		                } finally {
		                    lock.unlock();
		                }

		                Thread.sleep(1000); // Sleep for 1 second between productions
		            }
		        } catch (InterruptedException e) {
		            System.out.println(Thread.currentThread().getName() + " was interrupted.");
		            Thread.currentThread().interrupt();
		        }
		    }
		}

		class Consumer2 implements Runnable {
		    private final Queue<Integer> buffer;
		    private final Lock lock;
		    private final Condition notFull;
		    private final Condition notEmpty;

		    public Consumer2(Queue<Integer> buffer, Lock lock, Condition notFull, Condition notEmpty) {
		        this.buffer = buffer;
		        this.lock = lock;
		        this.notFull = notFull;
		        this.notEmpty = notEmpty;
		    }

		    @Override
		    public void run() {
		        try {
		            while (!Thread.currentThread().isInterrupted()) {
		                lock.lock();
		                try {
		                    while (buffer.isEmpty()) {
		                        notEmpty.await();
		                    }

		                    int data = buffer.poll();
		                    System.out.println(Thread.currentThread().getName() + " consumed: " + data);
		                    notFull.signalAll();
		                } finally {
		                    lock.unlock();
		                }

		                Thread.sleep(1000); // Sleep for 1 second between consumptions
		            }
		        } catch (InterruptedException e) {
		            System.out.println(Thread.currentThread().getName() + " was interrupted.");
		            Thread.currentThread().interrupt();
		        }
		 }

}
