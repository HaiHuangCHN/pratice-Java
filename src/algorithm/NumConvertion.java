package algorithm;

public class NumConvertion {

    public static String[] decimalToBinary(int z) {
        String array[] = new String[z];
        for (int i = 0;; i++) {
            int x = z % 2;
            if (z != 0) {
                array[i] = "" + x;
            } else if (z == 0) {
                break;
            }
            z = z / 2;
        }
        return array;
    }

}