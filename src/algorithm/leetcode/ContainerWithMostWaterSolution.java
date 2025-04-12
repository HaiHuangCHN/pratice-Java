package algorithm.leetcode;

/**
 * https://leetcode.cn/problems/container-with-most-water/
 */
class ContainerWithMostWaterSolution {
    public int maxArea(int[] height) {
        // i 和 j 分别是左下标和右下标
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            // 以更矮的那边计算面积
            // 备注：i++，以 i 的旧值计算，+1 后才返回
            // 之后，矮的那一边向右移（i），或者向左移（j）
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}