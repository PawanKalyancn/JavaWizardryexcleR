package Question4;
import java.util.LinkedList;
import java.util.Queue;

public class Implementproducerconsumerproblemusingthreadsynchronization {

	public static void main(String[] args) {

		        Queue<Integer> buffer = new LinkedList<>();
		        int bufferSize = 5; // Size of the shared buffer

		        Thread producerThread1 = new Thread(new Producer1(buffer, bufferSize), "Producer 1");
		        Thread producerThread2 = new Thread(new Producer1(buffer, bufferSize), "Producer 2");
		        Thread consumerThread1 = new Thread(new Consumer1(buffer), "Consumer 1");
		        Thread consumerThread2 = new Thread(new Consumer1(buffer), "Consumer 2");

		        producerThread1.start();
		        producerThread2.start();
		        consumerThread1.start();
		        consumerThread2.start();
		    }
		}

		class Producer1 implements Runnable {
		    private final Queue<Integer> buffer;
		    private final int bufferSize;

		    public Producer1(Queue<Integer> buffer, int bufferSize) {
		        this.buffer = buffer;
		        this.bufferSize = bufferSize;
		    }

		    @Override
		    public void run() {
		        while (true) {
		            synchronized (buffer) {
		                while (buffer.size() == bufferSize) {
		                    try {
		                        buffer.wait(); // Wait if the buffer is full
		                    } catch (InterruptedException e) {
		                        Thread.currentThread().interrupt();
		                        return;
		                    }
		                }

		                int data = (int) (Math.random() * 100);
		                buffer.offer(data);
		                System.out.println(Thread.currentThread().getName() + " produced: " + data);
		                buffer.notifyAll(); // Notify waiting consumers
		            }

		            try {
		                Thread.sleep(1000); // Sleep for 1 second between productions
		            } catch (InterruptedException e) {
		                Thread.currentThread().interrupt();
		                return;
		            }
		        }
		    }
		}

		class Consumer1 implements Runnable {
		    private final Queue<Integer> buffer;

		    public Consumer1(Queue<Integer> buffer) {
		        this.buffer = buffer;
		    }

		    @Override
		    public void run() {
		        while (true) {
		            synchronized (buffer) {
		                while (buffer.isEmpty()) {
		                    try {
		                        buffer.wait(); // Wait if the buffer is empty
		                    } catch (InterruptedException e) {
		                        Thread.currentThread().interrupt();
		                        return;
		                    }
		                }

		                int data = buffer.poll();
		                System.out.println(Thread.currentThread().getName() + " consumed: " + data);
		                buffer.notifyAll(); // Notify waiting producers
		            }

		            try {
		                Thread.sleep(1000); // Sleep for 1 second between consumptions
		            } catch (InterruptedException e) {
		                Thread.currentThread().interrupt();
		                return;
		            }
		        }
		    }
		}
		
		
