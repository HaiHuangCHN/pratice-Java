package concurrency.study;

/**
 * Not use synchronized, the two threads execute a++ at the same time
 *
 * @author Huang, Hai
 * @date 2020-01-20
 */
public class SynchronizedTest1 implements Runnable {
    // shared resource "i" of the two threads
    static int i = 0;

    // Not modified by synchronized key word
    public void method() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            method();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest1 test = new SynchronizedTest1();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
