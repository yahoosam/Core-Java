package com.demo.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.entity.CustomerDetails;

public class HashSetDemo {

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

		// In Hashset, duplicates are NOT allowed
		// Order is NOT maintained
		Set<CustomerDetails> set = new HashSet<>(list);

		System.out.println("Size: " + set.size());
		for (CustomerDetails element : set) {
			System.out.println(element.toString());
		}

	}

}
