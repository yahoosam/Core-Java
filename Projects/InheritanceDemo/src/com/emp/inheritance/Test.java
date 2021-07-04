package com.emp.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] { "EPG", "LCE", "Orbit" };
		Manager manager = new Manager(231123, "John Terrence", "MGR_Digital", 4000000, projects);
		manager.printdetails();
		manager.work();

		System.out.println("----------------------------------------------");

		Developer developer = new Developer(123112, "Stefan", "DEV_Frontend", 2000000, "Angular FSE");
		developer.printdetails();
		System.out.println(developer.technologystack);
		developer.work();
		
		System.out.println("----------------------------------------------");

		Developer developer2 = new Developer(87767, "Lorry Kit", "DEV_Backend", 1700000, "PHP");
		developer2.printdetails();
		System.out.println(developer2.technologystack);
		developer2.work();

		System.out.println("----------------------------------------------");

		String[] tools = new String[] { "postman", "seleinium" };
		Tester tester = new Tester(728392, "Kevin Dust", "Quality Assurance", 1500000, tools);
		tester.printdetails();
		tester.work();
	}

}
