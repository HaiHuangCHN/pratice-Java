package concurrency.study.skywang;

/**
 * Object lock example: lock code block
 *
 * @author Huang, Hai
 * @date 2020-01-20
 */
public class SynchronizedTest3 implements Runnable {
    // Shared resource
    static SynchronizedTest3 lock = new SynchronizedTest3();
//    static SynchronizedTest3 test = new SynchronizedTest3();
//    static SynchronizedTest3 test2 = new SynchronizedTest3();
    static int i = 0;

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("Execution starts: " + Thread.currentThread().getName());
            try {
                // Simulate execution
                Thread.sleep(3000);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Execution ends: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(lock);
        Thread t2 = new Thread(lock);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {
        }
        System.out.println("Execution ends!");
        System.out.println(i);
    }
}
