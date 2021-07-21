package com.demo.entity;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<CustomerDetails> {

	@Override
	public int compare(CustomerDetails o1, CustomerDetails o2) {
		// return o1.getName().compareTo(o2.getName());
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
