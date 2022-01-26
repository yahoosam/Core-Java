package com.concurrency.demo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThreadDemo implements Runnable {

	//static HashMap<String, Integer> myfruits = new HashMap<>();
	static ConcurrentHashMap<String, Integer> myfruits = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myfruits.put("PineApple", 80); // duplicate
		myfruits.put("Lemon", 30); // duplicate
		myfruits.put("Banana", 95); // new value
		myfruits.put("Grapes", 75); // duplicate
		myfruits.put("Kiwi", 80); // duplicate
		myfruits.put("Apple", 95);
	}

	public static void main(String[] args) throws InterruptedException {

		myfruits.put("Apple", 65);
		myfruits.put("Orange", 40);
		myfruits.put("Grapes", 75);
		myfruits.put("Kiwi", 85);
		myfruits.put("PineApple", 80);
		myfruits.put("Lemon", 20);
		myfruits.put("Lime", 10);

		// create a thread and modify the list from a different thread while iterating
		// the list..
		ConcurrentHashMapThreadDemo threaddemo = new ConcurrentHashMapThreadDemo();
		Thread mythread = new Thread(threaddemo);
		mythread.start();

		Iterator<String> fruits = myfruits.keySet().iterator();

		while (fruits.hasNext()) {
			Thread.sleep(1000);
			String fruit = fruits.next();
			System.out.println(fruit + ": " + myfruits.get(fruit));
		}

		System.out.println(myfruits);
	}

}
