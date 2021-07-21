package com.demo.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demp.entity.CustomerDetails;

public class TreeSetDemo {

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
		// Order is sorted based on Comparable implementation logic
		// Override compareTo() API
		Set<CustomerDetails> set = new TreeSet<>(list);

		System.out.println("Size: " + set.size());
		for (CustomerDetails element : set) {
			System.out.println(element.toString());
		}

	}

}
