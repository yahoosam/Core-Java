package com.emp.inheritance;

public class Manager extends Employee {
	String[] projects;

	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
	}

	@Override
	public void work() {
		super.work();
		System.out.println(this.name + " manages the below projects:");
		for (int i = 0; i < projects.length; i++) {
			System.out.println(projects[i]);
		}
	}

}
