package algorithm;

import org.junit.Test;

public class SequenceReversionTest {

    @Test
    public void testReverseSequence() {
        char[] array = { 'a', 'r' };
        SequenceReversion.reverseSequence(array);
        System.out.println(array);
    }

}
