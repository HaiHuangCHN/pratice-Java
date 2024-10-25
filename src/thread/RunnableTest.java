//package thread;
//
////RunnableTest.java 源码
//class MyThread implements Runnable {
//
//    private int ticket = 10;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 20; i++) {
//            if (this.ticket > 0) {
//                System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + this.ticket--);
//            }
//        }
//    }
//
//}
//
//public class RunnableTest {
//
//    public static void main(String[] args) {
//
//        MyThread mt = new MyThread();
//
//        // 启动3个线程 t1,t2,t3（它们共用一个Runnable对象）
//        Thread t1 = new Thread(mt);
//        Thread t2 = new Thread(mt);
//        Thread t3 = new Thread(mt);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//
//}
//
//// 实际测试结果：有时 10，有时 11，甚至 12，ticket 前加 volatile 也一样，本质原因是 ticket 不是线程安全
////Thread-2 卖票：ticket9
////Thread-0 卖票：ticket9
////Thread-0 卖票：ticket7
////Thread-0 卖票：ticket6
////Thread-0 卖票：ticket5
////Thread-0 卖票：ticket4
////Thread-0 卖票：ticket3
////Thread-0 卖票：ticket2
////Thread-0 卖票：ticket1
////Thread-1 卖票：ticket10
////Thread-2 卖票：ticket8
