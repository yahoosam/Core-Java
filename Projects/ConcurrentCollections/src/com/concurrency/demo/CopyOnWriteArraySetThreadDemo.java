package com.concurrency.demo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetThreadDemo implements Runnable {

	static CopyOnWriteArraySet<String> myfruits = new CopyOnWriteArraySet<>();
	// static CopyOnWriteArrayList<String> myfruits = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myfruits.add("PineApple"); // duplicate
		myfruits.add("Lemon"); // duplicate
		myfruits.add("Banana"); // new value
		myfruits.add("Grapes"); // duplicate
		myfruits.add("Kiwi"); // duplicate
	}

	public static void main(String[] args) throws InterruptedException {

		myfruits.add("Apple");
		myfruits.add("Orange");
		myfruits.add("Grapes");
		myfruits.add("Kiwi");
		myfruits.add("PineApple");
		myfruits.add("Lemon");
		myfruits.add("Lime");

		// create a thread and modify the list from a different thread while iterating
		// the list..
		CopyOnWriteArraySetThreadDemo threaddemo = new CopyOnWriteArraySetThreadDemo();
		Thread mythread = new Thread(threaddemo);
		mythread.start();

		Iterator<String> fruits = myfruits.iterator();

		while (fruits.hasNext()) {
			Thread.sleep(1000);
			String fruit = fruits.next();
			System.out.println(fruit);
		}

		System.out.println(myfruits);
	}

}
