package collection;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new HashSet<>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		Iterator<String> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		
		
		System.out.println("--------------------");
		for (String s : set) {
			System.out.println(s);
		}
		
//		// Display the elements in the hash set
//		for (String s: set) {
//			System.out.print(s.toUpperCase() + ", ");
//		}
	}
}
