package Question4;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threadsynchronizationusinglocksandconditions {

	public static void main(String[] args) {

		        resourcesource sharedResource = new resourcesource();
		        Thread producerThread = new Thread(new Producer(sharedResource));
		        Thread consumerThread = new Thread(new Consumer(sharedResource));

		        producerThread.start();
		        consumerThread.start();
		    }
		}

		class resourcesource {
		    private int data;
		    private boolean dataProduced;

		    private final Lock lock = new ReentrantLock();
		    private final Condition dataAvailable = lock.newCondition();
		    private final Condition spaceAvailable = lock.newCondition();

		    public void produce(int value) throws InterruptedException {
		        lock.lock();
		        try {
		            while (dataProduced) {
		                spaceAvailable.await();
		            }
		            data = value;
		            dataProduced = true;
		            System.out.println("Produced: " + data);
		            dataAvailable.signal();
		        } finally {
		            lock.unlock();
		        }
		    }

		    public int consume() throws InterruptedException {
		        lock.lock();
		        try {
		            while (!dataProduced) {
		                dataAvailable.await();
		            }
		            int consumedData = data;
		            dataProduced = false;
		            System.out.println("Consumed: " + consumedData);
		            spaceAvailable.signal();
		            return consumedData;
		        } finally {
		            lock.unlock();
		        }
		    }
		}

		class Producer implements Runnable {
		    private resourcesource sharedResource;

		    public Producer(resourcesource sharedResource) {
		        this.sharedResource = sharedResource;
		    }

		    @Override
		    public void run() {
		        try {
		            for (int i = 1; i <= 5; i++) {
		                sharedResource.produce(i);
		                Thread.sleep(1000); // Sleep for 1 second between productions
		            }
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		        }
		    }
		}

		class Consumer implements Runnable {
		    private resourcesource sharedResource;

		    public Consumer(resourcesource sharedResource) {
		        this.sharedResource = sharedResource;
		    }

		    @Override
		    public void run() {
		        try {
		            for (int i = 1; i <= 5; i++) {
		                 sharedResource.consume();
		                Thread.sleep(1000); // Sleep for 1 second between consumptions
		            }
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		        }
		    }
		}

	