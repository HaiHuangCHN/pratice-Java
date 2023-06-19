package thread.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest2 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Future<?>[] futureArray = new Future[5];

        for (int i = 0; i < 5; i++) {
            Future<?> fu = threadPool.submit(() -> {
                System.out.println("current thread name" + Thread.currentThread().getName());
                Object object = null;
                System.out.print("result## " + object.toString());
            });
            futureArray[i] = fu;
        }

        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future<?> future : futureArray) {
            if (future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}