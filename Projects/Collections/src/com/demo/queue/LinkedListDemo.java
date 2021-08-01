package com.demo.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.demo.entity.CustomerDetails;

public class LinkedListDemo {
	public static void main(String[] args) {

		Queue<CustomerDetails> queue = new LinkedList<>();

		queue.offer(new CustomerDetails(232, "Google", "Digital"));
		queue.offer(new CustomerDetails(429, "Yahoo", "email"));
		queue.offer(new CustomerDetails(131, "Lenovo", "Computers"));
		queue.offer(new CustomerDetails(232, "Google", "Digital"));
		queue.offer(new CustomerDetails(432, "Amazon", "Retail"));
		queue.offer(new CustomerDetails(928, "Walmart", "Retail"));
		queue.offer(new CustomerDetails(131, "Lenovo", "Computers"));
		queue.offer(new CustomerDetails(172, "Kohls", "Clothing"));

		System.out.println("Size: " + queue.size());
		CustomerDetails ele;
		while ((ele = queue.poll()) != null) {
			System.out.println(ele);
		}
		// In LinkedList queue, duplicates are allowed
		// Order is maintained, FIFO
	}
}
