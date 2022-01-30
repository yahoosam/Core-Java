package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		//data preparation
		List<String> originaldata = new ArrayList<>();
		originaldata.add("World");
		originaldata.add("is");
		originaldata.add("Beautiful");
		
		System.out.println(originaldata);
		
		//transform the data using map
		List<String> updateddata = originaldata.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(updateddata);
	}

}
