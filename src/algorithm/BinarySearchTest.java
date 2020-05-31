package algorithm;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		int[] array = { 1, 4, 7, 10, 13, 15, 21, 25 };
		int index = BinarySearch.binarySearch(array, 12);
		System.out.println(index);
		index = BinarySearch.binarySearch(array, 7);
		System.out.println(index);
	}

}
