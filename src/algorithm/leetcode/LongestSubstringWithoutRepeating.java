package algorithm.leetcode;

/**
 * 无重复字符的最长子串
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
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                left = charMap.get(currentChar) + 1;
            }
            charMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}