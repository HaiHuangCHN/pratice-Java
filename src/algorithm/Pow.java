package algorithm;

import java.math.BigInteger;

public class Pow {

	private static final BigInteger CONSTANT_1 = new BigInteger(new Integer(1).toString());

	public static BigInteger pow(BigInteger base, Integer power) {
		if (power == 0)
			return CONSTANT_1;
		if (power == 1)
			return base;
		if (isEven(power))
			return pow(base.multiply(base), power / 2);
		else
			return pow(base.multiply(base), power / 2).multiply(base);
	}

//	public static boolean isEven(Integer power) {
//		double doubleResult = power / 2.0;
//		int integerResult = power / 2;
//		if (doubleResult != integerResult) {
//			return false;
//		}
//		return true;
//	}

	public static boolean isEven(Integer power) {
		if (power % 2 == 0)
			return true;
		else
			return false;
	}

}
