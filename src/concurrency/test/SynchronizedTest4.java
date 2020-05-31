package concurrency.test;

/**
 * object lock example： use synchronized keyword
 * 
 * @author Huang, Hai
 * @date 2020-01-20
 */
public class SynchronizedTest4 implements Runnable {
    // Shared resource
    static SynchronizedTest4 test = new SynchronizedTest4();
    static int i = 0;

    public synchronized void method() {
        System.out.println("Execution starts: " + Thread.currentThread().getName());
        try {
            // Simulate execution
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Execution ends: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        method();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Execution ends!");
        System.out.println(i);
    }
}
