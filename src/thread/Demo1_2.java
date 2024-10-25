//package thread;
//
///**
// * 对于Demo1_2中，synchronized(this)中的this代表的是MyThread对象，而t1和t2是两个不同的MyThread对象
// * 这句话是错的，应该是：
// * 对于Demo1_2中，synchronized(this)中的this代表的是MyThread.start() 后t1和t2各自创建的 Runnable 对象，是两个不同的对象
// */
//class MyThread extends Thread {
//
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        synchronized (this) {
//            try {
//                for (int i = 0; i < 5; i++) {
//                    Thread.sleep(100); // 休眠100ms
//                    System.out.println(Thread.currentThread().getName() + " loop " + i);
//                }
//            } catch (InterruptedException ie) {
//            }
//        }
//    }
//}
//
//public class Demo1_2 {
//
//    public static void main(String[] args) {
//        Thread t1 = new MyThread("t1");  // 新建“线程t1”
//        Thread t2 = new MyThread("t2");  // 新建“线程t2”
//        t1.start();                            // 启动“线程t1”
//        t2.start();                            // 启动“线程t2”
//    }
//
//}