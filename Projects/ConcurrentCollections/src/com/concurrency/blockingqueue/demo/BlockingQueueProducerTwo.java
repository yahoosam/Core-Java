package com.concurrency.blockingqueue.demo;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducerTwo implements Runnable {

	private BlockingQueue<String> myqueue;

	public BlockingQueueProducerTwo(BlockingQueue<String> myqueue) {
		this.myqueue = myqueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Scanner getdata = new Scanner(System.in);
				String mystr = getdata.nextLine();
				myqueue.put(mystr);
				if (mystr.isEmpty()) {
					System.out.println("Producer2 Exit...");
					break;
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
