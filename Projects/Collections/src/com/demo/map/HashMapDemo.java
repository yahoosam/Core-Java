package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("John", 86);
		map.put("Paul", 56);
		map.put("Stefan", 94);
		map.put("Kevin", 67);
		map.put("Sharis", 72);
		map.put("Ashish", 83);
		map.put("Sammy", 49);
		map.put("Dominic", 78);

		map.put("John", 25);
		map.put("Paul", 35);
		map.put("Stefan", 11);

		// Hashmap uses equals() API to check if the keys are same, so HashMap replaces
		// the value if the key is same.
		// In HashMap, order is NOT maintained
		// If we insert the same "Key" which already exist, the new "Value" is
		// overwritten

		// Hashmap uses equals() API to check if the keys are same, so HashMap replaces
		// the value if the key is same.
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
