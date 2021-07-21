package com.demo.list;

import java.util.LinkedList;
import java.util.List;

import com.demp.entity.CustomerDetails;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<CustomerDetails> list = new LinkedList<>();

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
		// In LinkedList, duplicates are allowed 
		// Order is maintained
	}

}
