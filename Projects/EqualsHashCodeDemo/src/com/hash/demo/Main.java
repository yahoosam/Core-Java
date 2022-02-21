package com.hash.demo;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        //while using Hashmap, Hashset or HashTable, MUST override equals() and hashCode() APIs
        HashSet<Object> employeesmap = new HashSet<>();

        employeesmap.add(new Employee("John", 5000));
        employeesmap.add(new Employee("John", 5000));

        employeesmap.forEach(System.out::println);
    }
}
