package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock:
 * Thread-0 开始获取锁
 * Thread-0 得到锁
 * Thread-0 开工干活
 * Thread-1 开始获取锁
 * Thread-0 : 0
 * Thread-0 : 1
 * Thread-0 : 2
 * Thread-0 : 3
 * Thread-0 : 4
 * Thread-0 释放锁
 * Thread-1 得到锁
 * Thread-1 开工干活
 * Thread-1 被中断
 * Thread-1 做些别的事情
 * Thread-1 释放锁
 * <p>
 * lockInterruptibly:
 * Thread-0 开始获取锁
 * Thread-0 得到锁
 * Thread-0 开工干活
 * Thread-1 开始获取锁
 * Thread-1 被中断
 * Thread-1 做些别的事情
 * Thread-1 : 没有得到锁的线程运行结束
 * Thread-0 : 0
 * Thread-0 : 1
 * Thread-0 : 2
 * Thread-0 : 3
 * Thread-0 : 4
 * Thread-0 释放锁
 */
public class LockTest {

    private Lock lock = new ReentrantLock();

    public void doBussiness() {
        String name = Thread.currentThread().getName();

        try {
            System.out.println(name + " 开始获取锁");
            lock.lockInterruptibly();
            System.out.println(name + " 得到锁");
            System.out.println(name + " 开工干活");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(name + " : " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " 被中断");
            System.out.println(name + " 做些别的事情");
        } finally {
            try {
                lock.unlock();
                System.out.println(name + " 释放锁");
            } catch (Exception e) {
                System.out.println(name + " : 没有得到锁的线程运行结束");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LockTest lockTest = new LockTest();

        Thread t0 = new Thread(
                () -> lockTest.doBussiness()
        );

        Thread t1 = new Thread(
                new Runnable() {
                    public void run() {
                        lockTest.doBussiness();
                    }
                }
        );

        // 启动线程t1
        t0.start();
        Thread.sleep(10);
        // 启动线程t2
        t1.start();
        Thread.sleep(100);
        // 线程t1没有得到锁，中断t1的等待
        t1.interrupt();
    }

}