package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest3 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5, r -> {
            Thread t = new Thread(r);
            t.setUncaughtExceptionHandler((t1, e) -> System.out.println(t1.getName() + "线程抛出的异常" + e));
            return t;
        });

        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                System.out.println("current thread name" + Thread.currentThread().getName());
                Object object = null;
                System.out.print("result## " + object.toString());
            });
        }

    }

}