package com.demp.entity;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<CustomerDetails> {

	@Override
	public int compare(CustomerDetails o1, CustomerDetails o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return 0;
		}
	}

}
