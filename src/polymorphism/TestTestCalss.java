package polymorphism;

import java.util.Date;

import org.junit.Test;

public class TestTestCalss {

    @Test
    public void testClone() throws CloneNotSupportedException {
        TestClass testClass1 = new TestClass();
        testClass1.setDate(new Date());
        testClass1.setId(1);
        TestClass testClass2 = testClass1.clone();
        testClass2.setDate((Date) testClass1.getDate().clone());
        System.out.println(testClass1 == testClass2);
    }

}