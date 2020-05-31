package pattern;

import static pratice.NestedStaticTest1.StaticNested;

public class NestedStaticTest2 {

	public static void main(String args[]) {

		StaticNested nested = new StaticNested();
		nested.name();
	}

//	// static nested class in java
//	private static class StaticNested {
//		public void name() {
//			System.out.println("static nested class example in java");
//		}
//	}
}
