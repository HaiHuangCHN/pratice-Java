package algorithm;

/**
 * Greatest common divisor (最大公约数)
 */
public class GreatesCommonDivisor {

    /**
     * 欧几里得算法：两个整数的最大公约数等于其中较小的数和两数的差的最大公约数
     * 
     * @see https://www.sohu.com/a/314655845_250298
     * @param m
     * @param n
     * @return
     */
    public static int gcd(int m, int n) {
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        while (true) {
            if ((m = m % n) == 0) {
                return n;
            }
            System.out.println("m: " + m);
            System.out.println("n: " + n);
            if ((n = n % m) == 0) {
                return m;
            }
            System.out.println("m: " + m);
            System.out.println("n: " + n);
        }
    }

}
