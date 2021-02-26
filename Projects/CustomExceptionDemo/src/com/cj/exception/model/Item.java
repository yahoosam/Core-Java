package com.cj.exception.model;

import com.cj.exception.mycustomexception.MyCustomException;

public class Item {
	private int itemnumber;
	private double price;
	private String desc;
	private Boolean isfragile;
	
	public Item(int itemnumber, double price, String desc, Boolean isfragile) {
		this.itemnumber = itemnumber;
		this.price = price;
		this.desc = desc;
		this.isfragile = isfragile;
	}

	@Override
	public String toString() {
		return "Item [itemnumber=" + itemnumber + ", price=$" + price + ", desc=" + desc + ", isfragile=" + isfragile
				+ "]";
	}
	
	public static int itmayfailfunction(int i)  {
		int j = 0;
		try {
			j = 100/i;
		} catch (Exception e) {
			System.err.println("-- Error: " + e.getLocalizedMessage() + " -- " + e.getStackTrace()[0]);
		} finally {
			System.out.println("Some cleanup code here in finally block...");
		}
		return j;
	}
	
	public static int itmayfailthrowsfunction(int i) throws ArithmeticException {
		int j = 0;
		if (i <= 0) {
			throw new ArithmeticException("The value can't be negative or zero");
		} else {
			j = 100/i;
		}
		return j;
	}
	
	public static int itmayfailmycustexceptionfunction(int i) throws MyCustomException, ArithmeticException {
		int j = 0;
		if (i > 100) {
			throw new MyCustomException("Error handled in my custom exception");
		} else {
			j = 100/i;
		}
		return j;
	}
}
