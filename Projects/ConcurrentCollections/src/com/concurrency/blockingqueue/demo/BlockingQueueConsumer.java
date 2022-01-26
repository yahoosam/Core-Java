package com.concurrency.blockingqueue.demo;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumer implements Runnable {

	private BlockingQueue<String> myqueue;

	public BlockingQueueConsumer(BlockingQueue<String> myqueue) {
		this.myqueue = myqueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String receivedmsg = myqueue.take();
				if (receivedmsg.isEmpty()) {
					System.out.println("Consumer Exit...");
					break;
				}
				System.out.println("Received new order# --> " + receivedmsg);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
