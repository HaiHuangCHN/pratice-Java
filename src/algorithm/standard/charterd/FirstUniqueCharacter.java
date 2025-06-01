package algorithm.standard.charterd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * TODO Fill in desc
 *
 * @author hai.huang.a@outlook.com
 * @version 0.1.0
 * @date 2025/5/31 22:20
 * @since 0.1.0
 */
public class FirstUniqueCharacter {

    public static Character findFirstUnique(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        // 使用LinkedHashMap保持插入顺序
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // 第一次遍历：统计每个字符的出现次数
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // 第二次遍历：按插入顺序找到第一个计数为1的字符
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // 没有找到符合条件的字符
        return null;
    }

    public static Character findFirstUnique2(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        // 记录字符最后一次出现的索引
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        // 记录可能的候选字符索引（初始为-1表示未找到）
        int candidateIndex = -1;

        // 单次遍历：同时处理计数和候选索引
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndexMap.containsKey(c)) {
                // 字符重复出现，将其索引标记为无效（-2）
                lastIndexMap.put(c, -2);
            } else {
                // 首次出现，记录其索引
                lastIndexMap.put(c, i);
            }
        }

        // 遍历Map，找出最小的有效索引
        for (Map.Entry<Character, Integer> entry : lastIndexMap.entrySet()) {
            int index = entry.getValue();
            if (index >= 0) {
                if (candidateIndex == -1 || index < candidateIndex) {
                    candidateIndex = index;
                }
            }
        }

        return candidateIndex != -1 ? s.charAt(candidateIndex) : null;
    }

    public static void main(String[] args) {
        String test1 = "leetcode";
        System.out.println("第一个未重复字符是：" + findFirstUnique(test1)); // 输出 'l'

        String test2 = "loveleetcode";
        System.out.println("第一个未重复字符是：" + findFirstUnique(test2)); // 输出 'v'

        String test3 = "aabbcc";
        System.out.println("第一个未重复字符是：" + findFirstUnique(test3)); // 输出 null
    }
}
