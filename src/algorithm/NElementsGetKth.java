package algorithm;

import java.util.List;
import java.util.Random;

public class NElementsGetKth {

	private static final String RESULT = "";

	/**
	 * Generate random number array
	 * 
	 * @param n
	 * @return
	 */
	public int[] generateRandomArray(int n) {

		int[] intArray = new int[n];
		for (int i = 0; i < n; i++) {
			Random random = new Random();
			int randomNum = random.nextInt();
			intArray[i] = randomNum;
			System.out.println(intArray[i]);
		}
		return intArray;
	}

	/**
	 * Bubble sort ascending order
	 * 
	 * @param intArray
	 */
	public void bubbleSortAscendingOrder(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		// stub can be deleted
		System.out.print("After sort(ascending Order): ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Bubble sort descending order
	 * 
	 * @param intArray
	 */
	public void bubbleSortDescendingOrder(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] < intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		// TODO Stub to be deleted
		System.out.print("After sort(descending order): ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Bubble sort descending order for Integer List
	 * 
	 * @param numList
	 */
	public void bubbleSortDescendingOrder(List<Integer> numList) {
		for (int i = 0; i < numList.size() - 1; i++) {
			for (int j = 0; j < numList.size() - i - 1; j++) {
				if (numList.get(j) < numList.get(j + 1)) {
					numList.add(j, numList.get(j + 1));
					numList.remove(j + 2);
				}
			}
		}
		// stub can be deleted
		System.out.print("After sort(descending order): ");
		System.out.print(numList);
		System.out.println("");
	}

	public String binarySearch(int[] intArray, int n) {
		this.bubbleSortDescendingOrder(intArray);
		if (n > intArray[intArray.length / 2]) {

		}

		return RESULT;
	}

}
