package collection;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class ListTest {

	@Test
	public void test1() {
		// Create a ArrayList
		List<String> list = new ArrayList<>();

		// Add strings to the list
		list.add("London");
		list.add("Paris");
		list.add("Paris");
		System.out.println(list);
		Stream<String> stream = list.stream();
		System.out.println(stream);
		stream.forEach(System.out::println);

		Set set = new HashSet<>(list);
		System.out.println(set);

		List list3 = new ArrayList<>(set);
		System.out.println(list3);

		List<String> list2 = new ArrayList<>();

		list2.add("San Francisco");
		list2.add("Beijing");
		list2.add("New York");
		System.out.println(list2);

		boolean a = list2.addAll(list);

		System.out.println(a);
		System.out.println(list2);

	}

	@Test
	public void test2() {
		List<String> originalNumbers = new ArrayList<String>();
		originalNumbers.add("A");
		originalNumbers.add(null);
		System.out.println(originalNumbers.size());
		System.out.println(originalNumbers.contains(null));
	}

	@Test
	public void test3() {
		List<String> list = new ArrayList<>();
		list.add("London");
		list.add("Paris");
		list.add("Paris");


//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals("Paris")) {
//				list.remove(i);
//			}
//		}

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("Paris")) {
				itr.remove();
			}
		}

		System.out.println(list);

	}
	
	@Test
	public void test4() {
	    List<Integer> list1 = addList();
	    System.out.println(list1);
	}

    private List<Integer> addList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        return list;
    }
    
    @Test
    public void test5() {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        list1.add(2);
        list1.add(2);
        list2.add(2);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
    
    @Test
    public void test6() {
        List<String> list = new ArrayList<>();
        list.add("London");
        list.add("Paris");
        list.add("Paris");
        list = null;

        for (String temp : list) {
            System.out.println("0");
        }
    }
}
