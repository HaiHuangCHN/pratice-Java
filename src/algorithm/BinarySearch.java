package algorithm;

/**
 * 二叉查找法
 */
public class BinarySearch {

	private static final int NOT_FOUND = -1;

	public static int binarySearch(int[] array, int key) {
		int minIndex = 0;
		int maxIndex = array.length - 1;

		// Circulation condition, min <= max
		while (minIndex <= maxIndex) {
			// Formula to calculate the mid element
			int midIndex = (minIndex + maxIndex) / 2;
			// Compare the target and the mid element
			if (key > array[midIndex]) {
				minIndex = midIndex + 1;
			} else if (key < array[midIndex]) {
				maxIndex = midIndex - 1;
			} else {
				// Target fund, return the index of the element
				return midIndex;
			}
		}
		return NOT_FOUND;
	}
}
