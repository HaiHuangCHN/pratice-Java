package algorithm.hackerrank.traveloca;

import java.util.HashMap;
import java.util.Map;

public class ChooseMe {
    public static int findMinimumUnhappy(int N, int[] A, int T) {
        if (T >= N) {
            return 0; // 全部选或超过，没有不开心
        }
        Map<Integer, Integer> total = new HashMap<>();
        for (int num : A) {
            total.put(num, total.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> window = new HashMap<>();
        for (int i = 0; i < T; i++) {
            window.put(A[i], window.getOrDefault(A[i], 0) + 1);
        }
        int minUnhappy = calculateUnhappy(total, window);
        for (int i = T; i < N; i++) {
            int left = A[i - T];
            window.put(left, window.get(left) - 1);
            if (window.get(left) == 0) {
                window.remove(left);
            }
            int right = A[i];
            window.put(right, window.getOrDefault(right, 0) + 1);
            int currentUnhappy = calculateUnhappy(total, window);
            if (currentUnhappy < minUnhappy) {
                minUnhappy = currentUnhappy;
            }
        }
        return minUnhappy;
    }

    private static int calculateUnhappy(Map<Integer, Integer> total, Map<Integer, Integer> window) {
        int unhappy = 0;
        for (Map.Entry<Integer, Integer> entry : total.entrySet()) {
            int x = entry.getKey();
            int countInWindow = window.getOrDefault(x, 0);
            if (countInWindow > 0) {
                unhappy += entry.getValue() - countInWindow;
            }
        }
        return unhappy;
    }

    public static void main(String[] args) {
        int N = 6;
        int[] A = {1, 1, 2, 2, 3, 3};
        int T = 4;
        System.out.println(findMinimumUnhappy(N, A, T)); // 输出 0
    }
}