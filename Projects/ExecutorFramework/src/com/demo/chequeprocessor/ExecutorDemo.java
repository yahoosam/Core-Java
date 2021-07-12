package com.demo.chequeprocessor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		ChequeProcessor[] cp = { new ChequeProcessor("Bank", 3000), new ChequeProcessor("Online", 800),
				new ChequeProcessor("Mobile", 400), new ChequeProcessor("ATM", 2500), new ChequeProcessor("NEFT", 1200),
				new ChequeProcessor("RTGS", 2200), new ChequeProcessor("IMPS", 1000) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (ChequeProcessor chequeProcessor : cp) {
			service.submit(chequeProcessor);
		}

		service.shutdown();

		System.out.println("some code goes here in main");
	}

}
