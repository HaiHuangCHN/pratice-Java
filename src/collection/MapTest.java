package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class MapTest {
	@Test
	public void test1() {
		// Create a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		hashMap.put("Cook", 29);
		String key1 = "Lewis";
        hashMap.forEach((key, value) -> {
            if (key1.equals(key)) {
                System.out.println(key + ":" + value);
            }
            ;
        });
        System.out.println("-------------------------");

		System.out.println("Display entries in HashMap");
		System.out.println(hashMap + "\n");
		System.out.println(hashMap.get("Lewis") + "\n");
		Integer integer = (Integer) hashMap.get("ABC");
        System.out.println(integer);
		Set<String> set = hashMap.keySet();
		System.out.println(set);
		Iterator<String> i = set.iterator();
		System.out.println(i);
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("\n-----------treeMap---------");
		// Create a TreeMap from the preceding HashMap
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("Display entries in ascending order of key");
		System.out.println(treeMap);

		System.out.println("\n-----------linkedHashMap---------");
		// Create a LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 31);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);

		// Display the age for Lewis
		System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));

		System.out.println("Display entries in LinkedHashMap");
		System.out.println(linkedHashMap);
	}

	@Test
	public void test2() {
		// Create a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		hashMap.put("Cook", 29);

		Set<Entry<String, Integer>> entry = hashMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entry.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Map.Entry<String, Integer> entry2 : hashMap.entrySet()) {
			System.out.println(entry2.getValue());

		}
	}

	@Test
	public void test3() {
		Map<String, Map<String, Integer>> baggageAlwMap = new HashMap<String, Map<String, Integer>>();
		Map<String, Integer> _paxMap = new HashMap<String, Integer>(8);
		_paxMap.put("1", 30);
		baggageAlwMap.put("1", _paxMap);
		System.out.println(baggageAlwMap);

		String segmentRefer = "2";
		String paxRefer = "2";
		Integer weight = 20;
		if (baggageAlwMap.keySet().contains(segmentRefer)) {
			Map<String, Integer> paxMap = baggageAlwMap.get(segmentRefer);
			if (paxMap.keySet().contains(paxRefer)) {
				Integer allowance = paxMap.get(paxRefer);
				paxMap.put(paxRefer, allowance + Integer.valueOf(weight));
			} else {
				// Map<String,Integer> _paxMap = new HashMap<String,Integer>(8);
				paxMap.put(paxRefer, Integer.valueOf(weight));
				// baggageAlwMap.put(segmentRefer, _paxMap);
			}
		} else {
			Map<String, Integer> paxMap = new HashMap<String, Integer>(8);
			paxMap.put(paxRefer, Integer.valueOf(weight));
			baggageAlwMap.put(segmentRefer, paxMap);
		}
		System.out.println(baggageAlwMap);

	}
	
	@Test
    public void test4() {
        Map<String, Map<String, List<String>>> map = new HashMap<String, Map<String, List<String>>>();
        Map<String, List<String>> subMap = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        subMap.put("Tier level 1", list);
        map.put("Passenger reference 1", subMap);

        Map<String, List<String>> subMap2 = new HashMap<String, List<String>>();
        List<String> list2 = new ArrayList<String>();
        list2.add("3");
        list2.add("4");
        subMap2.put("Tier level 2", list2);
        map.put("Passenger reference 2", subMap2);

        System.out.println(map);

    }
	
    @Test
    public void whenCallsEqualsOnCollision_thenCorrect() {
        HashMap<MyKey, String> map = new HashMap<>();
        MyKey k1 = new MyKey(1, "firstKey");
        MyKey k2 = new MyKey(2, "secondKey");
        MyKey k3 = new MyKey(2, "thirdKey");

        System.out.println("storing value for k1");
        map.put(k1, "firstValue");

        System.out.println("storing value for k2");
        map.put(k2, "secondValue");

        System.out.println("storing value for k3");
        map.put(k3, "thirdValue");

        
        MyKey k1_1 = new MyKey(1, "firstKey");
        MyKey k2_1 = new MyKey(2, "secondKey");
        MyKey k3_1 = new MyKey(2, "thirdKey");


        System.out.println("retrieving value for k1");
        String v1 = map.get(k1_1);

        System.out.println("retrieving value for k2");
        String v2 = map.get(k2_1);

        System.out.println("retrieving value for k3");
        String v3 = map.get(k3_1);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }

}
