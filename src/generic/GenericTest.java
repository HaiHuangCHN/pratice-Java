package generic;

import org.junit.Test;

public class GenericTest {

	@Test
	public void test1() {
		GenericPoint<Integer> point1 = new GenericPoint<Integer>(1, 1);
		System.out.println(point1);

		GenericPoint<Double> point2 = new GenericPoint<Double>(3.456, 4.789);
		System.out.println(point2);
	}

	/**
	 * If not parameterize generic type, when invoke method, it can be any type
	 */
	@Test
	public void test2() {
		GenericPoint point = new GenericPoint(1, 2.2);
		System.out.println(point.toString());
		System.out.println(point.getX().getClass());
		System.out.println(point.getY().getClass());
	}

	@Test
	public void test3() {
		GenericPoint<Integer> gInteger = new GenericPoint<Integer>(1, 1);
		GenericPoint<Number> gNumber = new GenericPoint<Number>(456, 456);
		GenericTest.printlnValues(gInteger);
	}

	private <T> T printString(Class<T> clazz) {
		return null;
	}

	private static void printlnValues(GenericPoint<?> obj) {
		System.out.println(obj.toString());
	}

}