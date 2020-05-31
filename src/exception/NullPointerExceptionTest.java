package exception;

import org.junit.Test;

public class NullPointerExceptionTest {

    @Test
    public void test1() {
        String a = null;
        System.out.println(a.getClass());
    }

    @Test
    public void test2() {
        Exception e = new Exception("test");
        System.out.println(e.getLocalizedMessage());
    }

}
