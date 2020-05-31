package pratice;

public class NestedStaticTest1 {

	public static void main(String args[]) {

		StaticNested nested = new StaticNested();
		nested.name();
	}

	// static nested class in java
	public static class StaticNested {
		public void name() {
			System.out.println("static nested class example in java");
		}
	}
}

// Find another test in pattern package