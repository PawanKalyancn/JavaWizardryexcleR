package Question4;

public class ThreadCommunication {

	    public static void main(String[] args) {
	        resource sharedResource = new resource();

	        Thread producerThread = new ProducerThread(sharedResource);
	        Thread consumerThread = new ConsumerThread(sharedResource);

	        producerThread.start();
	        consumerThread.start();
	    }
	}

	class resource {
	    private int data;
	    private boolean dataProduced;

	    // Producer thread produces data
	    public synchronized void produce(int value) {
	        // If data has already been produced, wait for the consumer to consume it
	        while (dataProduced) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        // Produce data
	        data = value;
	        dataProduced = true;
	        System.out.println("Produced: " + data);

	        // Notify the consumer that data is ready
	        notify();
	    }

	    // Consumer thread consumes data
	    public synchronized int consume() {
	        // If data has not been produced yet, wait for the producer to produce it
	        while (!dataProduced) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	        // Consume data
	        int consumedData = data;
	        dataProduced = false;
	        System.out.println("Consumed: " + consumedData);

	        // Notify the producer that data has been consumed
	        notify();

	        return consumedData;
	    }
	}

	class ProducerThread extends Thread {
	    private resource sharedResource;

	    public ProducerThread(resource sharedResource) {
	        this.sharedResource = sharedResource;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            sharedResource.produce(i);
	        }
	    }
	}

	class ConsumerThread extends Thread {
	    private resource sharedResource;

	    public ConsumerThread(resource sharedResource) {
	        this.sharedResource = sharedResource;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            sharedResource.consume();
	        }
	    }
	}
