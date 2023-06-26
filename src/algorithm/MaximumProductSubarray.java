package algorithm;

/**
 * 富途证券面试题
 * <p>
 * https://leetcode.cn/problems/maximum-product-subarray/
 * <p>
 * 给你一个整数数组 nums，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * 子数组 是数组的连续子序列。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [2,3,-2]
 * 输出: 6
 *
 * @author haihuang95@zto.com
 * @version 0.1.0
 * @date 2023/6/15 16:05
 * @since 0.1.0
 */
public class MaximumProductSubarray {

    public static void main(String[] args) {
        // 假设数组如下
        int[] array = {2, 3, -2, 4, 5, -3};

        // 执行计算
        int maxMulti = calculateMaxSubSequenceMulti(array);

        // 输出结果
        System.out.println(maxMulti);
    }

    /**
     * @param array
     * @return
     */
    private static int calculateMaxSubSequenceMulti(int[] array) {
        // 如果是 == null，抛 Exception
        if (array == null) {
            throw new RuntimeException("数组不能为空");
        }

        // 如果只有一个元素的话，直接返回
        if (array.length == 1) {
            return array[0];
        }

        // 初始化最终输出值
        int maxMulti = array[0];
        // i 的意义 = 子序列的起始位置
        // j 的意义 = 子序列的终止位置
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                int thisMulti = 1;
                // k 的意义 = 子序列从起始位置到终止位置
                for (int k = i; k <= j; k++) {
                    thisMulti = array[k] * thisMulti;
                }

                if (thisMulti > maxMulti) {
                    maxMulti = thisMulti;
                }
            }
        }

        return maxMulti;
    }

    /**
     * @param array
     * @return
     */
    private static int calculateMaxSubSequenceMultiO2(int[] array) {
        int maxMulti = array[0], thisMulti = 0;
        for (int j = 0; j < array.length; j++) {
            if (j == 0) {
                thisMulti = array[j];
                continue;
            }
            thisMulti = array[j] * thisMulti;
            if (thisMulti > maxMulti) {
                maxMulti = thisMulti;
            } else if (thisMulti < 0) {
                thisMulti = 0;
            }
        }

        return maxMulti;
    }

    /**
     * 解题思路
     * 标签：动态规划
     * 遍历数组时计算当前最大值，不断更新
     * 令 imax 为当前最大值，则当前最大值为 imax = max(imax * nums[i], nums[i])
     * 由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值 imin，imin = min(imin * nums[i], nums[i])
     * 当负数出现时则 imax 与 imin 进行交换再进行下一步计算
     * 时间复杂度：O(n)
     * <p>
     * 补充：
     * 关键点就是这句话：“由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值 imin。”
     * <p>
     * 排除 0 后，若不存在负数的话，数组本身就会是最大乘积
     * <p>
     * imax = 表示以当前节点为终结节点的最大连续子序列乘积；imin = 表示以当前节点为终结节点的最小连续子序列乘积
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        //
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * num, num);
            imin = Math.min(imin * num, num);

            max = Math.max(max, imax);
        }

        return max;
    }

}
