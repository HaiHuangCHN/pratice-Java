package algorithm;

/**
 * Cubic Maximum Contiguous Subsequence Sum Algorithm
 * 
 * @author h.a.huang
 *
 */
public class MaxSubSeqSum {

	/**
	 * Way 1
	 * 
	 * @param array
	 * @return
	 */
	public static int maxSubSum1(int[] array) {
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int thisSum = 0;
				for (int k = i; k <= j; k++) {
					thisSum += array[k];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;

	}

	/**
	 * Way 2
	 * 
	 * @param array
	 * @return
	 */
	public static int maxSubSum2(int[] array) {
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			int thisSum = 0;
			for (int j = i; j < array.length; j++) {
				thisSum += array[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}

	/**
	 * Way 3
	 * 
	 * @param array
	 * @return
	 */
	public static int maxSubSum3(int[] array) {
		return maxSumRec(array, 0, array.length - 1);
	}

	private static int maxSumRec(int array[], int left, int right) {
		if (left == right) {
			if (array[left] > 0)
				return array[left];
			else
				return 0;
		}

		int center = (left + right) / 2;
		int maxLeftSum = maxSumRec(array, left, center);
		int maxRightSum = maxSumRec(array, center + 1, right);

		int maxLeftBorderSum = 0, leftBorderSum = 0;
		for (int i = center; i >= left; i--) {
			leftBorderSum += array[i];
			if (leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}

		int maxRightBorderSum = 0, rightBorderSum = 0;
		for (int i = center + 1; i <= right; i++) {
			rightBorderSum += array[i];
			if (rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}

		}
		return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);

	}

	private static int max3(int maxLeftSum, int maxRightSum, int leftRightSum) {
		int result = maxLeftSum;
		if (result < maxRightSum) {
			result = maxRightSum;
		} else if (result < leftRightSum) {
			result = leftRightSum;
		}
		return result;
	}

	/**
	 * Way 4
	 * 
	 * @param array
	 * @return
	 */
	public static int maxSubSum4(int array[]) {
		int maxSum = 0, thisSum = 0;
		for (int j = 0; j < array.length; j++) {
			thisSum += array[j];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			} else if (thisSum < 0) {
				thisSum = 0;
			}
		}
		return maxSum;
	}

}
