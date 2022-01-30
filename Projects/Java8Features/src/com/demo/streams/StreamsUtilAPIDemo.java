package com.demo.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUtilAPIDemo {

	public static void main(String[] args) {
		List<Integer> completeList = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			completeList.add(i);
		}

		List<Integer> filteredstream = completeList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredstream);

		// count() - find the count of the filtered list
		long count = completeList.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count(): " + count);

		// sort() - sort the list in asc order and collected to a list
		List<Integer> sortedlistasc = completeList.stream().filter(i -> i % 2 == 0).sorted()
				.collect(Collectors.toList());
		System.out.println("sorted() - " + sortedlistasc);

		//define custom comparators to use in sorting, min, max funtions
		Comparator<Integer> custasccomp = (i1, i2) -> i1.compareTo(i2);
		Comparator<Integer> custdsccomp = (i1, i2) -> i2.compareTo(i1);
		
		// sort() - dsc order using custom dsc comparator
		List<Integer> sortedlistdsc = completeList.stream().filter(i -> i % 2 == 0).sorted(custdsccomp).collect(Collectors.toList());
		System.out.println("sorted(customcomparator) - " + sortedlistdsc);
		
		//min() - get the min value from the list
		Integer minval = sortedlistdsc.stream().min(custasccomp).get();
		System.out.println("min(customcomparator) - " + minval);
		
		//max() - get the max value from the list
		Integer maxval = sortedlistdsc.stream().max(custasccomp).get();
		System.out.println("max(customcomparator) - " + maxval);
		
		//foreach() - Take an expression and apply it to each and every element in the stream
		sortedlistasc.stream().forEach(intval -> System.out.println("Inside foreach logic: " + intval));
	}

}
