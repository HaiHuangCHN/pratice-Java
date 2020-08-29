package algorithm;

import java.util.Scanner;

public class Main {

    private static final String CHARACTER_STRING = new String("abcdefghijklmnopqrstuvwxyz");
    private static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {

        String[] inputStringArray = new String[1000];
        int lines = S.nextInt();
        int j = 0;
        while (lines > 0) {
            inputStringArray[j] = S.next();
            j++;
            lines--;
        }
        int k = 0;
        while (inputStringArray[k] != null) {
            char[] inputCharArray = inputStringArray[k].toCharArray();
            char[] characterArray = CHARACTER_STRING.toCharArray();
            for (int i = 0; i <= inputCharArray.length - 1; i++) {
                inputCharArray[i] = characterArray[(CHARACTER_STRING.indexOf(inputCharArray[i]) + calculate(i)) % 26];
            }
            k++;
            System.out.println(inputCharArray);
        }
        S.close();
    }

    private static int calculate(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        return calculate(i - 1) + calculate(i - 2) + calculate(i - 3);
    }

}