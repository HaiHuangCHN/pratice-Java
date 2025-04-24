package algorithm.traveloca;

import java.util.HashMap;
import java.util.Map;
// Mettl
/**
 *
 */
public class ChooseMe {
    public static int findMinimumUnhappy(int input1, int[] input2, int input3) {
        if (input3 >= input1) {
            return 0; // 若选取的学生数大于等于总学生数，没有不开心的学生
        }
        Map<Integer, Integer> total = new HashMap<>();
        for (int num : input2) {
            total.put(num, total.getOrDefault(num, 0) + 1); // 统计每个学生值的总出现次数
        }
        Map<Integer, Integer> window = new HashMap<>();
        for (int i = 0; i < input3; i++) {
            window.put(input2[i], window.getOrDefault(input2[i], 0) + 1); // 初始化窗口内的学生值统计
        }
        int minUnhappy = calculateUnhappy(total, window); // 计算初始窗口的不开心数
        for (int i = input3; i < input1; i++) {
            int left = input2[i - input3];
            window.put(left, window.get(left) - 1); // 移除左边的元素
            if (window.get(left) == 0) {
                window.remove(left); // 如果该元素在窗口内次数为0，移除该键
            }
            int right = input2[i];
            window.put(right, window.getOrDefault(right, 0) + 1); // 加入右边的元素
            int currentUnhappy = calculateUnhappy(total, window); // 计算当前窗口的不开心数
            if (currentUnhappy < minUnhappy) {
                minUnhappy = currentUnhappy; // 更新最小不开心数
            }
        }
        return minUnhappy;
    }

    private static int calculateUnhappy(Map<Integer, Integer> total, Map<Integer, Integer> window) {
        int unhappy = 0;
        for (Map.Entry<Integer, Integer> entry : total.entrySet()) {
            int x = entry.getKey();
            int countInWindow = window.getOrDefault(x, 0);
            if (countInWindow > 0) { // 只有窗口内存在该学生值时，才计算不开心数
                unhappy += entry.getValue() - countInWindow; // 总次数减去窗口内次数
            }
        }
        return unhappy;
    }

    public static void main(String[] args) {
        int N = 7;
        int[] A = {1, 1, 2, 2, 2, 3, 3};
        int T = 7;
        System.out.println(findMinimumUnhappy(N, A, T)); // 输出1，符合预期
    }
}