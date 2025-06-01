package algorithm.standard.charterd;

/**
 * TODO Fill in desc
 *
 * @author hai.huang.a@outlook.com
 * @version 0.1.0
 * @date 2025/5/26 18:15
 * @since 0.1.0
 */
public class Factorial {
    public static void main(String[] args) {
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println(factorial(5));
        // 3! = 3 * 2 * 1 = 6
        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        if (n >= 2) {
            return n * factorial(n - 1);
        } else {
            return n;
        }
    }
}
