package com.demo.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassDemo {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();

		mylist.add(80);
		mylist.add(15);
		mylist.add(10);
		mylist.add(90);
		mylist.add(20);
		mylist.add(40);
		mylist.add(70);
		mylist.add(30);

		System.out.println(mylist);

		System.out.println("After natural order Sorting...");
		Collections.sort(mylist);
		System.out.println(mylist);
		
		System.out.println("After custom comaprator Dsc Order Sorting...");
		Collections.sort(mylist, new CustomComparatorDsc());
		System.out.println(mylist);
		
		System.out.println("After custom comaprator Asc Order Sorting...");
		Collections.sort(mylist, new CustomComparatorAsc());
		System.out.println(mylist);
		
		System.out.println("After reverse...");
		Collections.reverse(mylist);
		System.out.println(mylist);
	}

}
