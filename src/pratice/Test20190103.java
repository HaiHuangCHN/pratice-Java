package pratice;

import java.math.BigDecimal;

public class Test20190103 {
	public static void main(String[] args) {
		String str = "1400000000000.00";
		testVoid(str);
	}

	private static void testVoid(String str) {
		System.out.println(new BigDecimal(new BigDecimal(str).stripTrailingZeros().toPlainString()));
		return;
	}
}
