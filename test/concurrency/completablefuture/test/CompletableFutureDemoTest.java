package concurrency.completablefuture.test;

import org.junit.Test;

public class CompletableFutureDemoTest {
    @Test
    public void testCompletableFutureDemo() {
        CompletableFutureDemo completableFutureDemo = new CompletableFutureDemo();
        completableFutureDemo.calculateAsync();
    }
}
