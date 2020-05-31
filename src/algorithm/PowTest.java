package algorithm;

import java.math.BigInteger;

import org.junit.Test;

public class PowTest {

	@Test
	public void testPow() {
		BigInteger result = Pow.pow(new BigInteger("5"), 4);
		System.out.println(result);
	}

	@Test
	public void testIsEven() {
		System.out.println(Pow.isEven(5));
	}

}
