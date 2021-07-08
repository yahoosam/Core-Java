package com.dynamicbinding;

public class Demo {

	public static void main(String[] args) {
		MacBook macbook = new MacBook();
		MacBook macbook1 = new MacBookPro();
		MacBook macbook2 = new MacBookAir();

		macbook.start();
		macbook.shutdown();
		System.out.println(macbook.s);

		macbook1.start();
		macbook1.shutdown();
		System.out.println(macbook1.s);

		macbook2.start();
		macbook2.shutdown();
		System.out.println(macbook2.s);

		MacBookAir macbookair = (MacBookAir) macbook2;
		System.out.println(macbookair.s);
	}

}
