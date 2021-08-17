package concurrency.future.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

import static org.junit.Assert.assertEquals;

public class FactorialSquareCalculatorUnitTest {

    private Set<Byte> statusSet = new HashSet<Byte>() {
        {
            this.add(Byte.valueOf("1"));
        }
    };

    @Test
    public void whenCalculatesFactorialSquare_thenReturnCorrectValue() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        FactorialSquareCalculator calculator = new FactorialSquareCalculator(10);

        forkJoinPool.execute(calculator);

        assertEquals("The sum of the squares from 1 to 10 is 385", 385, calculator.join().intValue());
    }

    @Test
    public void test() {
        long i = 120454004532L;
        Long converted = Long.valueOf(i);
        System.out.println(converted.hashCode() % 32);
    }

    @Test
    public void test2() {
    }

}
