package com.demo.accessmodifier;

public class AccessModifierDemo {

	public int i = 10;
	int j = 20;
	protected int k = 30;
	private int l = 40;

	public static void main(String[] args) {
		AccessModifierDemo amd = new AccessModifierDemo();

		System.out.println("Same Class public " + amd.i);
		System.out.println("Same Class default " + amd.j);
		System.out.println("Same Class protected " + amd.k);
		System.out.println("Same Class private " + amd.l);
	}

}
