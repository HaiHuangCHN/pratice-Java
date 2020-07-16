package algorithm;

public class Factorial {

    /**
     * Calculate factorial (阶乘)
     * 
     * @param input
     * @return
     * @throws Exception
     */
    public static long factorialResult(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n must be a non-negative number!");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorialResult(n - 1);
    }
}
