package com.demo.threading.waitnotify;

public class WaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		CommonData cd = new CommonData();

		Thread producer = new Thread(new DataProducer(cd));
		Thread consumer = new Thread(new DataConsumer(cd));

		consumer.start();
		Thread.sleep(5000);
		producer.start();
		System.out.println("main program some code before exit " + Thread.currentThread().getName() + "- Exit");
	}
}
