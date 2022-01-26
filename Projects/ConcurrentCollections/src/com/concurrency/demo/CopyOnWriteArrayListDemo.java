package com.concurrency.demo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		//ArrayList<String> myfruits = new ArrayList<>();
		CopyOnWriteArrayList<String> myfruits = new CopyOnWriteArrayList<>();
		
		myfruits.add("Apple");
		myfruits.add("Orange");
		myfruits.add("Grapes");
		myfruits.add("Kiwi");
		myfruits.add("PineApple");
		myfruits.add("Lemon");
		myfruits.add("Lime");

		Iterator<String> fruits = myfruits.iterator();

		while (fruits.hasNext()) {
			String fruit = fruits.next();
			System.out.println(fruit);
			if(fruit.equals("Grapes"))
				myfruits.remove("Grapes");// try to modify the list while iterating the array
		}
		
		System.out.println(myfruits);
	}

}
