package algorithm;

/**
 * 4. 给你一个整数数组 nums，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * 子数组 是数组的连续子序列。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [2,3,-2]
 * 输出: 6
 */

/**
 * TODO Fill in desc
 *
 * @author haihuang95@zto.com
 * @version 0.1.0
 * @date 2023/6/15 16:05
 * @since 0.1.0
 */
public class FutuInterview {

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
     *
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

}
