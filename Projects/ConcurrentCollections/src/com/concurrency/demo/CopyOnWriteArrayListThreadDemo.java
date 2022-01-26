package com.concurrency.demo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListThreadDemo implements Runnable{
	
	//static ArrayList<String> myfruits = new ArrayList<>();
	static CopyOnWriteArrayList<String> myfruits = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myfruits.add("Banana");
	}
	
	public static void main(String[] args) throws InterruptedException {

		myfruits.add("Apple");
		myfruits.add("Orange");
		myfruits.add("Grapes");
		myfruits.add("Kiwi");
		myfruits.add("PineApple");
		myfruits.add("Lemon");
		myfruits.add("Lime");

		//create a thread and modify the list from a different thread while iterating the list..
		CopyOnWriteArrayListThreadDemo threaddemo = new CopyOnWriteArrayListThreadDemo();
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
