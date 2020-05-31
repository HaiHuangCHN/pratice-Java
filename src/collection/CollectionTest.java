package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

public class CollectionTest {
	@Test
	public void test1() {
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");

		System.out.println("A list of cities in collection1:");
		System.out.println(collection1);

		System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));

		collection1.remove("Dallas");
		System.out.println("\n" + collection1.size() + " cities are in collection1 now");

		Collection<String> collection2 = new ArrayList<>();
		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angles");
		collection2.add("Atlanta");

		System.out.println("\nA list of cities in collection2:");
		System.out.println(collection2);

		ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
		c1.addAll(collection2);
		System.out.println("\nCities in collection1 or collection2: ");
		System.out.println(c1);

		c1 = (ArrayList<String>) (collection1.clone());
		c1.retainAll(collection2);
		System.out.print("\nCities in collection1 and collection2: ");
		System.out.println(c1);

		c1 = (ArrayList<String>) (collection1.clone());
		c1.removeAll(collection2);
		System.out.print("\nCities in collection1, but not in 2: ");
		System.out.println(c1);
	}

	@Test
	public void test2() {
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");
		System.out.println(Collections.max(collection1).toString());

		Collection<Integer> collection2 = new ArrayList<>();
		collection2.add(1);
		collection2.add(2);
		collection2.add(3);
		collection2.add(4);
		System.out.println(Collections.max(collection2).toString());

	}

}
