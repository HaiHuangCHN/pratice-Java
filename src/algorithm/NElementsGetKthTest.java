package algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NElementsGetKthTest {

	private NElementsGetKth nElementsGetKth;

	@Before
	public void before() {
		NElementsGetKth nElementsGetKth = new NElementsGetKth();
		this.nElementsGetKth = nElementsGetKth;
	}

	@Test
	public void testGenerateRandomArray() {
		nElementsGetKth = new NElementsGetKth();
		nElementsGetKth.generateRandomArray(10);
	}

	@Test
	public void testBubbleSortAsce() {
		int[] intArray = new int[] { 7, 3, 5, 1, 1, 10, 7 };
		nElementsGetKth.bubbleSortAscendingOrder(intArray);
	}

	@Test
	public void testBubbleSortDesc() {
		int[] intArray = new int[] { 7, 3, 5, 1, 1, 10, 7 };
		nElementsGetKth.bubbleSortDescendingOrder(intArray);
	}

	@Test
	public void testBubbleSortDescList() {
		List<Integer> numList = new ArrayList<>();
		numList.add(15);
		numList.add(20);
		numList.add(11);
		numList.add(1);
		numList.add(5);
		numList.add(11);
		nElementsGetKth.bubbleSortDescendingOrder(numList);
	}

}
