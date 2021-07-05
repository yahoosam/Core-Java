package com.emp.inheritance;

public class Developer extends Employee {
	String technologystack;

	public Developer(int id, String name, String dept, double salary, String technologystack) {
		super(id, name, dept, salary);
		this.technologystack = technologystack;
	}

	@Override
	public void work() {
		super.work();
		System.out.println(this.name + " is working on the following technology: " + technologystack);
	}
}
