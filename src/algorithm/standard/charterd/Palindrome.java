package algorithm.standard.charterd;

/**
 * TODO Fill in desc
 *
 * @author hai.huang.a@outlook.com
 * @version 0.1.0
 * @date 2025/5/26 18:02
 * @since 0.1.0
 */
public class Palindrome {

    @org.junit.Test
    public void main(String[] args) {
        // true
        System.out.println(Palindrome.isPalindrome("MADAM"));
        // false
        System.out.println(Palindrome.isPalindrome("HELLO"));
        // true
        System.out.println(Palindrome.isPalindrome("12321"));
        // true
        System.out.println(Palindrome.isPalindrome(null));
        // true
        System.out.println(Palindrome.isPalindrome(""));
        // false
        System.out.println(Palindrome.isPalindrome("LLL"));
    }

    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) {
            return true;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
