package algorithm;

public class SequenceReversion {

    public static void reverseSequence(char array[]) {
        char c;
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            c = array[i];
            array[i] = array[j];
            array[j] = c;
        }
    }
}
