package com.concurrency.blockingqueue.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		// create the size of the blocking queue
		BlockingQueue<String> myqueue = new ArrayBlockingQueue<>(1024);

		BlockingQueueProducer blockingQueueProducer = new BlockingQueueProducer(myqueue);
		BlockingQueueProducerTwo blockingQueueProducerTwo = new BlockingQueueProducerTwo(myqueue);
		BlockingQueueConsumer blockingQueueConsumer = new BlockingQueueConsumer(myqueue);

		new Thread(blockingQueueConsumer).start();
		Thread.sleep(1000);
		new Thread(blockingQueueProducerTwo).start();
		Thread.sleep(2000);
		new Thread(blockingQueueProducer).start();
	}

}
