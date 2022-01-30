package com.project.streams;

import java.util.Comparator;

public class OrderDetails {

	private int orderNumber;
	private int storeNumber;
	private String customerName;
	private String orderLines;
	private float orderTotal;

	public OrderDetails(int orderNumber, int storeNumber, String customerName, String orderLines, float orderTotal) {
		this.orderNumber = orderNumber;
		this.storeNumber = storeNumber;
		this.customerName = customerName;
		this.orderLines = orderLines;
		this.orderTotal = orderTotal;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(String orderLines) {
		this.orderLines = orderLines;
	}

	public float getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderNumber=" + orderNumber + ", storeNumber=" + storeNumber + ", customerName="
				+ customerName + ", orderLines=" + orderLines + ", orderTotal=" + orderTotal + "]";
	}

	// custom comparators to compare objects
	public static Comparator<OrderDetails> asctotalcomp = (ord1, ord2) -> {
		if (ord1.getOrderTotal() > ord2.getOrderTotal())
			return 1;
		else if (ord1.getOrderTotal() < ord2.getOrderTotal())
			return -1;
		else
			return 0;
	};
	
	public static Comparator<OrderDetails> ascordernumcomp = (ord1, ord2) -> {
		if (ord1.getOrderNumber() > ord2.getOrderNumber())
			return 1;
		else if (ord1.getOrderNumber() < ord2.getOrderNumber())
			return -1;
		else
			return 0;
	};
}
