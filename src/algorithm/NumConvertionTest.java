package algorithm;

import org.junit.Test;

public class NumConvertionTest {

    @Test
    public void testReverseSequence() {
        String array[] = NumConvertion.decimalToBinary(11);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                System.out.print(array[i]);
            }
        }

    }

}