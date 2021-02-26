package com.cj.exception.ui;

import com.cj.exception.model.Item;
import com.cj.exception.mycustomexception.MyCustomException;

public class ExceptionDemo {

	public static void main(String[] args) throws ArithmeticException {
		System.out.println("-- Exception Demo --");
		
		Item item1 = new Item(101, 62.45, "Coke", true);
		System.out.println(item1);	
		
		Item.itmayfailfunction(0);
		
		Item item2 = new Item(102, 876.02, "Samsung Oven", false);
		System.out.println(item2);	
		
		try {
			Item.itmayfailthrowsfunction(-1);
		} catch (ArithmeticException e) {
			System.err.println("-- Error: " + e.getLocalizedMessage() + " -- " + e.getStackTrace()[0]);
		} finally {
			System.out.println("Some cleanup code here in finally block...");
		}
		
		Item item3 = new Item(103, 106.74, "LG Dish Washer", false);
		System.out.println(item3);
		
		try {
			Item.itmayfailmycustexceptionfunction(899);
		} catch (MyCustomException e) {
			System.err.println("-- Error: " + e.getLocalizedMessage() + " -- " + e.getStackTrace()[0]);
		} finally {
			System.out.println("Some cleanup code here in finally block...");
		}
		
		Item item4 = new Item(104, 25.98, "Vu+ TV", true);
		System.out.println(item4);
	}

}
