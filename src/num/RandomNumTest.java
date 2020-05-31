package num;

import java.util.HashSet;

import num.RandomNum;

public class RandomNumTest {

	public static void main(String[] args) {
		int[] reult1 = RandomNum.randomCommon(20, 50, 10);
		System.out.print("randomCommon: ");
		for (int i : reult1) {
			System.out.print(i + " ");
		}
		System.out.println("");

		HashSet<Integer> set = new HashSet<Integer>();
		RandomNum.randomSet(20, 50, 10, set);
		System.out.print("randomSet:    ");
		for (int i : set) {
			System.out.print(i + " ");
		}
		System.out.println("");

		int[] reult2 = RandomNum.randomArray(5, 10, 5);
		System.out.print("randomArray:  ");
		for (int i : reult2) {
			System.out.print(i + " ");
		}

	}

}
