package algorithm.jd;

import java.util.ArrayList;
import java.util.List;

// 给定一个包含正整数数组 nums，其中包含 n 个正整数，并且原始数组有序，且数组中不包含重复的数字。你的任务是找出所有可能的排列，使得这些排列中的数字之和等于给定的目标值 target。
// 具体要求输入：一个整数数组 nums 和一个目标和 target。
// 输出：一个整数数组列表，列表中的每个元素代表一个满足条件的排列，即该排列中所有数字之和等于 target。
// 示例输入：nums = [1, 2, 4, 5, 7], target = 7
// 输出：[[1, 2, 4], [2, 5], [7]]
public class CombinationSumNoReuse {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // 边界条件：数组为空或最小元素大于target时直接返回空
        if (nums == null || nums.length == 0 || nums[0] > target) {
            return result;
        }
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int remaining, int start, List<Integer> path, List<List<Integer>> result) {
        // 终止条件：剩余和为0时，当前路径有效
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        // 从start开始遍历（避免重复组合），且数组有序可剪枝
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            // 剪枝：当前数大于剩余和时，后续数更大，无需继续
            if (num > remaining) {
                break;
            }
            // 选择当前数（不可复用，下一轮从i+1开始）
            path.add(num);
            backtrack(nums, remaining - num, i + 1, path, result);
            // 撤销选择（回溯）
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSumNoReuse solution = new CombinationSumNoReuse();
        //
        //// 测试用例1：标准情况（元素不可复用）
        //int[] nums1 = {2, 3, 5};
        //int target1 = 8;
        //System.out.println("测试用例1结果：" + solution.combinationSum(nums1, target1));
        //// 输出: [[3, 5]] （2+3+3不可用，因3不可复用；2+2+2+2不可用，因2不可复用）
        //
        //// 测试用例2：多组合情况
        //int[] nums2 = {1, 2, 3, 4};
        //int target2 = 5;
        //System.out.println("测试用例2结果：" + solution.combinationSum(nums2, target2));
        //// 输出: [[1, 4], [2, 3]] （元素不可复用）
        //
        //// 测试用例3：无有效组合
        //int[] nums3 = {3, 4, 5};
        //int target3 = 2;
        //System.out.println("测试用例3结果：" + solution.combinationSum(nums3, target3));
        //// 输出: []
        //
        //// 测试用例4：边界值组合
        //int[] nums4 = {1, 2, 3};
        //int target4 = 4;
        //System.out.println("测试用例4结果：" + solution.combinationSum(nums4, target4));
        //// 输出: [[1, 3]] （2+2不可用，因2不可复用）

        int[] nums5 = {1, 2, 4, 5, 7};
        int target5 = 7;
        System.out.println("测试用例4结果：" + solution.combinationSum(nums5, target5));
    }
}

    