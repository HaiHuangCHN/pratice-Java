package algorithm.leetcode;

/**
 * 3. 无重复字符的最长子串
 *
 * @author hai.huang.a@outlook.com
 * @date 2025/7/9 00:07
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 输出 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 输出 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 输出 3
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 记录最长无重复子串的长度
        int maxLength = 0;
        // 滑动窗口的左边界
        int left = 0;
        // 用于存储字符及其最后一次出现的位置
        Map<Character, Integer> charMap = new HashMap<>();

        // 遍历字符串，right 为滑动窗口的右边界
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // 如果当前字符已经在 Map 中，并且其最后一次出现的位置在左边界右侧
            // 则需要将左边界移动到该字符最后一次出现位置的下一个位置
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                left = charMap.get(currentChar) + 1;
            }

            // 更新当前字符的最后出现位置
            charMap.put(currentChar, right);

            // 计算当前窗口的长度，并更新最大长度
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}