package com.emp.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;

	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public void work() {
		this.printdetails();
		System.out.println("Common work for all employees");
	}

	public void printdetails() {
		System.out.println("Employee ID: " + this.id);
		System.out.println("Name :" + this.name);
		System.out.println("Department :" + this.dept);
		System.out.println("Salary :" + this.salary);
	}
}
