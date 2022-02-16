package com.project.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDemo {

	public static void main(String[] args) {

		ArrayList<OrderDetails> orderlist = new ArrayList<>();

		orderlist.add(new OrderDetails(101, 2413, "John", "TV Order", 2500.23f));
		orderlist.add(new OrderDetails(18, 1658, "Sam", "Table Order", 50.28f));
		orderlist.add(new OrderDetails(159, 1211, "Kyle", "Oven Order", 100.00f));
		orderlist.add(new OrderDetails(272, 2433, "Brandon", "Furniture Order", 870.87f));
		orderlist.add(new OrderDetails(362, 1211, "Kyle", "Vessels Order", 1247.58f));
		orderlist.add(new OrderDetails(652, 3003, "Rajath", "Clock Order", 560.10f));

		orderlist.add(new OrderDetails(410, 2413, "Raj", "TV Order", 1100.38f));
		orderlist.add(new OrderDetails(428, 1658, "Kumar", "Table Order", 8300.21f));
		orderlist.add(new OrderDetails(498, 1211, "Nurfield", "Oven Order", 2020.98f));
		orderlist.add(new OrderDetails(444, 2433, "Ranjith", "Furniture Order", 500.43f));
		orderlist.add(new OrderDetails(421, 3003, "Brem", "Clock Order", 200.76f));
		orderlist.add(new OrderDetails(1219, 1211, "Kyle", "Mixer Order", 230.90f));

		// print the order list
		System.out.println(orderlist.size());
		for (OrderDetails order : orderlist) {
			System.out.println(order);
		}

		System.out.println("------------------filtered-----------------");
		// use case - get the orders from store# 1211, customer# Kyle
		List<OrderDetails> filteredorders = orderlist.stream().filter(order -> (order.getStoreNumber() == 1211))
				.collect(Collectors.toList()).stream()
				.filter(cusorder -> (cusorder.getCustomerName().compareTo("Kyle") == 0)).collect(Collectors.toList());

		System.out.println(filteredorders.size());
		for (OrderDetails order : filteredorders) {
			System.out.println(order);
		}

		System.out.println("----------sorted asc order total-----------");
		List<OrderDetails> filteredorderstotalsorted = filteredorders.stream().sorted(OrderDetails.asctotalcomp)
				.collect(Collectors.toList());
		System.out.println(filteredorderstotalsorted.size());
		for (OrderDetails order : filteredorderstotalsorted) {
			System.out.println(order);
		}

		System.out.println("----------sorted asc order number-----------");
		List<OrderDetails> filteredordersordernumsorted = filteredorders.stream().sorted(OrderDetails.ascordernumcomp)
				.collect(Collectors.toList());
		System.out.println(filteredordersordernumsorted.size());
		for (OrderDetails order : filteredordersordernumsorted) {
			System.out.println(order);
		}

		System.out.println("----------sorted dsc order number using streams sorted api-----------");
		orderlist.stream()
				.filter(order -> ((order.getStoreNumber() == 1211) && (order.getCustomerName().compareTo("Kyle") == 0)))
				.collect(Collectors.toList())
				.stream()
				.sorted(Comparator.comparing(OrderDetails::getOrderNumber).reversed())
				.forEach(System.out::println);
	}

}
