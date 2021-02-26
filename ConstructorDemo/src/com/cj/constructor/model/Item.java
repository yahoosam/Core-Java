package com.cj.constructor.model;

public class Item {
	private static double SALES_TAX = 4.6;
	private int itemnumber;
	private double price;
	private String desc;
	private Boolean isfragile;
	
	//default
	public Item() {
		System.out.println("An item object created...");
	}

	//parameterized
	public Item(int itemnumber, double price, String desc, Boolean isfragile) {
		this();
		this.itemnumber = itemnumber;
		this.price = price;
		this.desc = desc;
		this.isfragile = isfragile;
	}
	
	//copy
	public Item(Item item) {
		this(item.itemnumber, item.price, item.desc, item.isfragile);
	}

	public int getItemnumber() {
		return itemnumber;
	}

	public void setItemnumber(int itemnumber) {
		this.itemnumber = itemnumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getIsfragile() {
		return isfragile;
	}

	public void setIsfragile(Boolean isfragile) {
		this.isfragile = isfragile;
	}

	public static double getSALES_TAX() {
		return SALES_TAX;
	}

	@Override
	public String toString() {
		return "Item [itemnumber=" + itemnumber + ", price=$" + price + ", desc=" + desc + ", isfragile=" + isfragile
				+ "]";
	}
	
	public static double calculateCartTotal(Item itemarr[]) {
		double total = 0;
		for(Item item : itemarr) {
			total += item.price;
		}
		return total + (total * SALES_TAX / 100);
	}
}
