package com.demo.package2;

import com.demo.accessmodifier.AccessModifierDemo;

public class DifferentPackageExtends extends AccessModifierDemo {

	public static void main(String[] args) {
		DifferentPackageExtends dpe = new DifferentPackageExtends();
		
		System.out.println("Extends Class public " + dpe.i);
		System.out.println("Extends Class NO ACCESS default");
		System.out.println("Extends Class protected " + dpe.k);
		System.out.println("Extends Class NO ACCESS private");
	}

}
