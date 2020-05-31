package concurrency.study;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private Lock lock = new ReentrantLock(); // ReentrantLock is the sub-class of Lock

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();

        // Thread 1
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                // Thread.currentThread() return current thread 的引用
                try {
                    lockTest.method(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");

        // Thread 2
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    lockTest.method(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2");

        t1.start();
        t2.start();
    }

//    private void method(Thread thread) {
//        lock.lock(); // acquire lock object
//        try {
//            System.out.println("Thread name: " + thread.getName() + " acquire lock");
//            // Thread.sleep(2000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Thread name: " + thread.getName() + " release lock");
//            lock.unlock(); // release lock object
//        }
//    }

//    private void method(Thread thread) {
//        // lock.lock(); // acquire lock object
//        if (lock.tryLock()) {
//            try {
//                System.out.println("Thread name: " + thread.getName() + " acquire lock");
//                // Thread.sleep(2000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("Thread name: " + thread.getName() + " release lock");
//                lock.unlock(); // release lock object
//            }
//        }
//    }

    private void method(Thread thread) throws InterruptedException {
        // lock.lock(); // 获取锁对象

        // if cannot get the lock in 2s, won't wait for it
        if (lock.tryLock(5, TimeUnit.SECONDS)) {
            try {
                System.out.println("Thread name: " + thread.getName() + " acquire lock");

                // sleep for 3s
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Thread name: " + thread.getName() + " release lock");
                lock.unlock(); // release lock object
            }
        }
    }
}
