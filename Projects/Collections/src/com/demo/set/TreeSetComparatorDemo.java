package com.demo.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.entity.CustomerDetails;
import com.demo.entity.CustomerIdComparator;
import com.demo.entity.CustomerIndustryComparator;
import com.demo.entity.CustomerNameComparator;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
		List<CustomerDetails> list = new ArrayList<>();

		list.add(new CustomerDetails(232, "Google", "Digital"));
		list.add(new CustomerDetails(429, "Yahoo", "email"));
		list.add(new CustomerDetails(131, "Lenovo", "Computers"));
		list.add(new CustomerDetails(232, "Google", "Digital"));
		list.add(new CustomerDetails(432, "Amazon", "Retail"));
		list.add(new CustomerDetails(928, "Walmart", "Retail"));
		list.add(new CustomerDetails(131, "Lenovo", "Computers"));
		list.add(new CustomerDetails(172, "Kohls", "Clothing"));

		System.out.println("Size: " + list.size());
		for (CustomerDetails element : list) {
			System.out.println(element.toString());
		}

		// In Treeset, duplicates are NOT allowed
		// Order is sorted based on Comparator implementation logic
		// The advantage of comparator is, we can have our own custom number of
		// comparators

		Set<CustomerDetails> set = new TreeSet<>(new CustomerIdComparator());
		set.addAll(list);

		System.out.println("Sorted with idcomparator - Size: " + set.size());
		for (CustomerDetails element : set) {
			System.out.println(element.toString());
		}

		Set<CustomerDetails> set2 = new TreeSet<>(new CustomerNameComparator());
		set2.addAll(list);
		System.out.println("Sorted with namecomparator - Size: " + set2.size());
		for (CustomerDetails element : set2) {
			System.out.println(element.toString());
		}

		Set<CustomerDetails> set3 = new TreeSet<>(new CustomerIndustryComparator());
		set3.addAll(list);
		System.out.println("Sorted with industrycomparator - Size: " + set3.size());
		for (CustomerDetails element : set3) {
			System.out.println(element.toString());
		}

		// without using TreeSet, use the comparator directly in the ArrayList Ex below
		System.out.println("ArrayList sorted with NameComparator - Size: " + list.size());
		Collections.sort(list, new CustomerNameComparator());
		for (CustomerDetails element : list) {
			System.out.println(element.toString());
		}

	}

}
