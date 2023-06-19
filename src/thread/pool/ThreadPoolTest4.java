package thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest4 {

    public static void main(String[] args) {
        String a = "f7296534ce624f688268e55544ffdf0b37562ac71dbcede4fe4f994b4e9487b7d66934849204373e127cfacc709cd5fd9152a53c06d778fc391aee84aa3364a3";
        String b = "f7296534ce624f688268e55544ffdf0b37562ac71dbcede4fe4f994b4e9487b7d66934849204373e127cfacc709cd5fd9152a53c06d778fc391aee84aa3364a3";
        System.out.println(a.equalsIgnoreCase(b));
//        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(1);
//
//        for (int i = 0; i < 5; i++) {
//            threadPool.scheduleWithFixedDelay(() -> {
//                System.out.println("current thread name" + Thread.currentThread().getName());
//                Object object = null;
//                System.out.print("result## " + object.toString());
//            }, 1, 3, TimeUnit.SECONDS);
//        }

    }

}