package algorithm.nike;

/**
 * #### Question 1: Arrays
 * Write a function that takes an array of integers and returns the maximum sum of any contiguous subarray.
 *
 * @author hai.huang.a@outlook.com
 * @date 2025/5/2 18:21
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray(nums));
    }

    private static int maximumSubarray(int[] nums) {

        // 如果数组为空，最大和为 0
        if (nums == null || nums.length == 0) return 0;

        // 初始化当前最大子数组和与全局最大子数组和为数组的第一个元素
        int currentSum = nums[0];
        int maxSum = nums[0];

        // 从数组的第二个元素开始遍历
        for (int i = 1; i < nums.length; i++) {
            // 更新当前最大子数组和
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 更新全局最大子数组和
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
