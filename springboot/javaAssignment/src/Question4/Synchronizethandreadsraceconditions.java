package Question4;

public class Synchronizethandreadsraceconditions {
    public static void main(String[] args) {
        // Create a shared resource
        SharedResource sharedResource = new SharedResource();

        // Create and start multiple threads that access the shared resource
        Thread thread1 = new MyThread1("Thread 1", sharedResource);
        Thread thread2 = new MyThread1("Thread 2", sharedResource);

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private int count = 0;

    // Use synchronized keyword to ensure thread safety
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        }
    }
}

class MyThread1 extends Thread {
    private SharedResource sharedResource;

    public MyThread1(String name, SharedResource sharedResource) {
        super(name);
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.increment();
    }
}
