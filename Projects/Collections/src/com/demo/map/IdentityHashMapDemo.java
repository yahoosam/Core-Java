package com.demo.map;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new IdentityHashMap<>();

		map.put(new String("John"), 100);
		map.put(new String("Paul"), 56);
		map.put(new String("Stefan"), 94);
		map.put(new String("Kevin"), 67);
		map.put(new String("Sharis"), 72);
		map.put(new String("Ashish"), 83);
		map.put(new String("Sammy"), 49);
		map.put(new String("Dominic"), 78);

		map.put(new String("John"), 1);
		map.put(new String("Paul"), 35);
		map.put(new String("Stefan"), 11);

		// In IdentityHashMap, order is maintained
		// If we insert the same "Key" which already exist, the new "Value" is
		// overwritten

		// IdentityHashMap uses the == operator so the old value is retained
		// In this example have used new String() API because if we use plain string,
		// string pooling will happen and == operator points to the same address
		System.out.println(map);
		System.out.println();

		Set<String> keySet = map.keySet();
		Collection<Integer> values = map.values();

		System.out.println(keySet);
		System.out.println(values);

		for (String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		}

	}

}
