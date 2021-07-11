package com.demo.threading.waitnotify;

public class DataProducer implements Runnable {
	CommonData cd;

	public DataProducer(CommonData cd) {
		this.cd = cd;
	}

	@Override
	public void run() {
		System.out.println("producer Thread " + Thread.currentThread().getName() + "- Entry");
		cd.produce();
		System.out.println("producer Thread " + Thread.currentThread().getName() + "- Exit");
	};
}
