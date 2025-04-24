package algorithm.leetcode.hsbc;

import java.util.Arrays;

public class PartialSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2, 7, 6};
        int k = 3;
        partialSort(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void partialSort(int[] arr, int k) {
        // 前k个元素升序排序
        Arrays.sort(arr, 0, k);

        // 剩余部分降序排序
        Arrays.sort(arr, k, arr.length);

        reverse(arr, k, arr.length - 1);
    }

    // 辅助方法：反转数组的一部分
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
