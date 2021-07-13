package com.demo.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		SumCalculator[] sc = { new SumCalculator(10), new SumCalculator(20), new SumCalculator(30),
				new SumCalculator(40), new SumCalculator(50), new SumCalculator(60), new SumCalculator(70),
				new SumCalculator(80), new SumCalculator(90) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (SumCalculator sumCalculator : sc) {
			Future<Integer> future = service.submit(sumCalculator);

			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		service.shutdown();
		System.out.println("some code goes here in main");
	}

}
