package pratice;

public class TestTryCatchStringBuilder {
	public static void main(String[] args) {
		TestTryCatchStringBuilder test = new TestTryCatchStringBuilder();
		System.out.println(test.fun());
	}

	public StringBuilder fun() {
		StringBuilder s = new StringBuilder("Hello");
		try {
			// Doing something
			s.append("Word");
			return s;
		} catch (Exception e) {
			return s;
		} finally {
			s.append("finally");
		}
	}
}