package algorithm;

/**
 * Greatest common divisor (最大公约数)
 */
public class GreatesCommonDivisor {

    public static int gcd(int m, int n) {
        while (true) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }

}
