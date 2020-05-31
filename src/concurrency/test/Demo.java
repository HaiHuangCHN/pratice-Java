package concurrency.test;

//Demo.java 的源码
class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread mythread = new MyThread1("mythread");

        System.out.println(Thread.currentThread().getName() + " call mythread.run()");
        mythread.run();

        System.out.println(Thread.currentThread().getName() + " call mythread.start()");
        mythread.start();
    }
    
}