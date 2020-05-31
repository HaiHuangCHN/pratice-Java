package praticeArray;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * Primitive data type variable should be both declared and initialized
		 * (assignment) before it can be used.
		 */

		/*
		 * int i = 0;// "int i;": It is wrong because it should be initialize.
		 * System.out.println(i);
		 */

		/*
		 * Array variable should be initialized before it can be used.
		 */
		double[] a = new double[2];
		/*
		 * If not initialize, then means that a[0] and a[1] will be 0.0.
		 */
		/*
		 * a[0] = 1.2; a[1] = 1.3;
		 */
		/*
		 * If write in this way: "System.out.println(a);", then the output will be
		 * reference: "[D@7852e922"
		 */
		System.out.println(a[1]);
		/* a[1] = 1.0; */

		List<String> b = Arrays.asList("Huang, Hai", "Lin, Jiale");

		List<Integer> c = Arrays.asList(1, 2, 3);

		System.out.println(b.get(1));
		System.out.println(c.get(1));

	}

}
