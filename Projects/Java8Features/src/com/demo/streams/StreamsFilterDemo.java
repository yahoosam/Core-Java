package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterDemo {

	public static void main(String[] args) {
		// use case - list has numbers from 0 - 100, filter the even numbers and print

		// data preparation
		List<Integer> completeList = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			completeList.add(i);
		}

//		// legacy way to filter the list
//		ArrayList<Integer> filteredlist = new ArrayList<>();
//		// iterate over the complete list
//		for (Integer cl : completeList) {
//			if (cl % 2 == 0)
//				filteredlist.add(cl);
//		}
//		// print the output
//		System.out.println(filteredlist);

		// filter using streams
		List<Integer> filteredstream = completeList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredstream);
	}

}
