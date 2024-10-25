package thread.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallable call");
        return "success";
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        try {
            Future<String> future = threadPool.submit(new MyCallable());
            System.out.println(future.get());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            threadPool.shutdown();
        }
    }

}