package com.cj.constructor.ui;

import com.cj.constructor.model.Item;

public class ConstructorDemo {
	
	{
		System.out.println("3. Inside non-static block");
	}
	
	static {
		System.out.println("1. Inside static block");
	}
	
	public ConstructorDemo() {
		System.out.println("4. Inside constructor block");
	}

	public static void main(String[] args) {
		System.out.println("2. Inside static main block");
		ConstructorDemo cd = new ConstructorDemo();
		
		System.out.println("-- Constructor Demo --");
		Item itemarr[] = new Item[3];
		
		itemarr[0] = new Item();
		itemarr[0].setItemnumber(101);
		itemarr[0].setPrice(816.12);
		itemarr[0].setDesc("Samsung Microwave Oven");
		itemarr[0].setIsfragile(false);
		
		itemarr[1] = new Item(102, 2.45, "Pepsi Plastic Bottle", false);
		
		itemarr[2] = new Item(itemarr[1]);
		itemarr[2].setItemnumber(103);
		itemarr[2].setDesc("Pepsi Glass Bottle");
		itemarr[2].setIsfragile(true);
		
		System.out.println(itemarr[0]);
		System.out.println(itemarr[1]);
		System.out.println(itemarr[2]);
		
		System.out.println("Sales Tax: $" + Item.getSALES_TAX());
		System.out.printf("Cart Total: $%.2f", Item.calculateCartTotal(itemarr));
	}

}
