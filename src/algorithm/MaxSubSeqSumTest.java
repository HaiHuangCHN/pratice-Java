package algorithm;

import org.junit.Test;

public class MaxSubSeqSumTest {

	@Test
	public void testMaxSubSum1() {
		int[] array = new int[8];
		array[0] = -2;
		array[1] = 6;
		array[2] = -1;
		array[3] = 5;
		array[4] = 4;
		array[5] = -7;
		array[6] = 2;
		array[7] = 3;
		int output = MaxSubSeqSum.maxSubSum1(array);
		System.out.println(output);
	}

	@Test
	public void testMaxSubSum2() {
		int[] array = new int[8];
		array[0] = -2;
		array[1] = 6;
		array[2] = -1;
		array[3] = 5;
		array[4] = 4;
		array[5] = -7;
		array[6] = 2;
		array[7] = 3;
		int output = MaxSubSeqSum.maxSubSum2(array);
		System.out.println(output);
	}

	@Test
	public void testMaxSubSum3() {
		int[] array = new int[8];
		array[0] = -2;
		array[1] = 6;
		array[2] = -1;
		array[3] = 5;
		array[4] = 4;

		array[5] = -7;
		array[6] = 2;
		array[7] = 3;
		int output = MaxSubSeqSum.maxSubSum3(array);
		System.out.println(output);
	}

	@Test
	public void testMaxSubSum4() {
		int[] array = new int[8];
		array[0] = -2;
		array[1] = 6;
		array[2] = -1;
		array[3] = 5;
		array[4] = 4;
		array[5] = -7;
		array[6] = 2;
		array[7] = 3;
		int output = MaxSubSeqSum.maxSubSum4(array);
		System.out.println(output);
	}
}
