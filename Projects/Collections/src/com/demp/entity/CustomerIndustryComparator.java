package com.demp.entity;

import java.util.Comparator;

public class CustomerIndustryComparator implements Comparator<CustomerDetails> {

	@Override
	public int compare(CustomerDetails o1, CustomerDetails o2) {
		// return o1.getIndustry().compareTo(o2.getIndustry());
		return o1.getIndustry().compareToIgnoreCase(o2.getIndustry());
	}

}
