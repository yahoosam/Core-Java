package com.emp.inheritance;

public class Tester extends Employee {
	String[] tools;

	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}

	@Override
	public void work() {
		super.work();
		System.out.println(this.name + " uses the below tools:");
		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}
	}
}
