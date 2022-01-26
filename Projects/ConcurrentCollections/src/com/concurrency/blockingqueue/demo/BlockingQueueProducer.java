package com.concurrency.blockingqueue.demo;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {

	private BlockingQueue<String> myqueue;

	public BlockingQueueProducer(BlockingQueue<String> myqueue) {
		this.myqueue = myqueue;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			myqueue.put("Apple MacBook Order");
			Thread.sleep(2000);
			myqueue.put("iPhone Order");
			Thread.sleep(2000);
			myqueue.put("Lenovo T480s Laptop Order");
			Thread.sleep(2000);
			myqueue.put("Dell Laptop Order");
			Thread.sleep(2000);
			myqueue.put("Apple MacBook PRO Order");
			Thread.sleep(2000);
			myqueue.put("iPhone PRO Order");
			Thread.sleep(2000);
			myqueue.put("Lenovo T50s Laptop Order");
			Thread.sleep(2000);
			myqueue.put("Dell PRO Laptop Order");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
