package algorithm;

import java.util.Scanner;

public class Main2 {

    private static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        char[] inputArray = new char[100];
        inputArray[0] = 0;

        String nums = S.nextLine();
        char[] numArray = nums.toCharArray();
        int i = 0;
        int j = 0;
        int length = numArray.length;
        while (length > 0) {
            if (numArray[j] == ' ') {
                j++;
                length--;
                continue;
            }
            inputArray[i] = numArray[j];
            i++;
            j++;
            length--;
        }

        if (inputArray[1] == -1) {
            System.out.println();
            return;
        }

        getMinNode(getAllChildNode(inputArray));

        S.close();
    }

    private static void getMinNode(char[] allChildNode) {
        
    }

    private static char[] getAllChildNode(char[] inputArray) {
        char[] childNodeArray = new char[100];
        int length = inputArray.length;
        int i = 1;
        int j = 0;
        while (length > 0) {
            if (inputArray[i * 2] == -1 && inputArray[i * 2 + 1] == -1) {
                childNodeArray[j] = inputArray[i];
                j++;
            }
            i++;
            length--;
        }
        return childNodeArray;
    }

}