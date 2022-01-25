package com.demo.collectionsutil;

import java.util.Comparator;

public class CustomComparatorAsc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
