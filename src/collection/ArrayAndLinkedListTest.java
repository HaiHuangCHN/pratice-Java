package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ArrayAndLinkedListTest {
	@Test
	public void test1() {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1); // 1 is autoboxed to new Integer(1)
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);

		System.out.println("A list of integers in the array list:");
		System.out.println(arrayList);

		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		linkedList.add(1, "red");
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.addFirst("green");
		System.out.println(linkedList);

		System.out.println("Display the linked list backward:");
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			System.out.print(linkedList.get(i) + " ");
		}
	}

	/**
	 * ArrayList pratice
	 */
	@Test
	public void test2() {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add(null);
		cityList.add("Miami");
		cityList.add(null);
		cityList.add("Tokyo");
		System.out.println(cityList.size());
		for (String city : cityList) {
			System.out.println(city);
			System.out.println(city.toUpperCase());
		}
		/*
		 * London Denver null Miami null Tokyo
		 */
//		for (int i = 0; i < cityList.size(); i++) {
//			System.out.println(cityList.get(i));
//		}
//		System.out.println(cityList.get(5));
		// Display the contents in the list
//		if (cityList == null) {
//			System.out.println("null");
//		} else if (cityList.isEmpty()) {
//			System.out.println("empty" /* + cityList.get(index) */);
//		}
		/*
		 * System.out.println(cityList);//Or write in this way:
		 * System.out.println(cityList.toString());
		 */

//		List<Long> numberList = new ArrayList<Long> ();
//		numberList.add(464897979797L);
//		numberList.add(Long.valueOf("1111111111"));
//		Long number0 = numberList.get(0);
//		Long number1 = numberList.get(1);
//		System.out.println(number0);
//		System.out.println(number1);
//		if (number0.toString().startsWith("464")) {
//			System.out.println("True");
//		}

	}
}
