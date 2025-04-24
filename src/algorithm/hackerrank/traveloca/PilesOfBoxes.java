package algorithm.hackerrank.traveloca;

import java.util.Arrays;

public class PilesOfBoxes {
    public static long pilesOfBoxes(int[] boxesInPiles) {
        // 转换为 Integer 数组以便使用比较器进行降序排序
        Integer[] boxArray = new Integer[boxesInPiles.length];
        for (int i = 0; i < boxesInPiles.length; i++) {
            boxArray[i] = boxesInPiles[i];
        }
        // 降序排序
        Arrays.sort(boxArray, (a, b) -> b - a);

        long steps = 0;
        for (int i = 1; i < boxArray.length; i++) {
            // 如果当前元素和前一个元素不相等，说明要把前面所有和前一个元素相同高度的箱子堆都降到当前高度
            if (!boxArray[i].equals(boxArray[i - 1])) {
                steps += i;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] sampleInput3 = {2, 2, 2};
        System.out.println(pilesOfBoxes(sampleInput3)); // 输出应该是0

        int[] boxesInPiles = {5, 2, 1};
        System.out.println(pilesOfBoxes(boxesInPiles)); // 输出应该是3

        int[] sampleInput0 = {4, 5, 5, 2, 4};
        System.out.println(pilesOfBoxes(sampleInput0)); // 输出应该是6

        int[] sampleInput1 = {886, 777};
        System.out.println(pilesOfBoxes(sampleInput1)); // 输出应该是1
    }
}
