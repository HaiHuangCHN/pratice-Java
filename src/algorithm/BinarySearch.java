package algorithm;

public class BinarySearch {

	private static final int NOT_FOUND = -1;

	public static int binarySearch(int[] array, int key) {
		int min = 0;
		int max = array.length - 1;

		// Circulation condition, min <= max
		while (min <= max) {
			// Formula to calculate the mid element
			int mid = (min + max) / 2;
			// Compare the target and the mid element
			if (key > array[mid]) {
				min = mid + 1;
			} else if (key < array[mid]) {
				max = mid - 1;
			} else {
				// Target fund, return the index of the element
				return mid;
			}
		}
		return NOT_FOUND;
	}
}
