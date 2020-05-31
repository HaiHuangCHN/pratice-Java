package pratice;

public class TestTryCatchInt {
	public static void main(String[] args) {
		TestTryCatchInt test = new TestTryCatchInt();
		System.out.println(test.fun());
	}

	public int fun() {
		int i = 10;
		try {
			// doing something

			return i;
		} catch (Exception e) {
			return i;
		} finally {
			i = 20;
		}
	}
}
