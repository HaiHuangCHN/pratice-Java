package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest1 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            threadPool.submit(() -> {
                System.out.println("current thread name" + Thread.currentThread().getName());
                try {
                    Object object = null;
                    System.out.print("result## " + object.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

    }
}