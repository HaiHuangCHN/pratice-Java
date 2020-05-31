package concurrency.study.skywang;

// ThreadTest.java 源码
class MyThreadExtendsThread extends Thread {

    private int ticket = 10;

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.ticket > 0) {
                System.out.println(this.getName() + " 卖票：ticket" + this.ticket--);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // 启动3个线程t1,t2,t3；每个线程各卖10张票！
        MyThreadExtendsThread t1 = new MyThreadExtendsThread();
        MyThreadExtendsThread t2 = new MyThreadExtendsThread();
        MyThreadExtendsThread t3 = new MyThreadExtendsThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
