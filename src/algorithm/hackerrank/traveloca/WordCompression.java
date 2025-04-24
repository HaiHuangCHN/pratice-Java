package algorithm.hackerrank.traveloca;

import java.util.Stack;

public class WordCompression {
    static class CharCount {
        char c;
        int count;

        public CharCount(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public static String compressWord(String word, int k) {
        Stack<CharCount> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            // 当栈不为空，且栈顶字符和当前字符相同时，就把栈顶的计数加 1
            if (!stack.isEmpty() && stack.peek().c == ch) {
                stack.peek().count++;
                // 如果计数达到了 k，就把栈顶弹出（因为这 k 个字符要被删除）
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                // 如果栈顶字符和当前字符不同，就把当前字符入栈，计数设为 1
                stack.push(new CharCount(ch, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            // 从栈顶读取到栈底，反着写即可得到答案
            sb.insert(0, stack.pop().c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "abbcccb";
        int k = 2;
        System.out.println(compressWord(word, k)); // 输出 "a"
    }
}