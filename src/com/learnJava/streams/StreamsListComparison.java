package com.learnJava.streams;

import java.util.ArrayList;
import java.util.List;
class Employee {
    private int empID;
    private String name;
    private int age;

    public Employee(int empID, String name, int age) {
        this.empID = empID;
        this.name = name;
        this.age = age;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + "]";
    }
}

public class StreamsListComparison {
    public static void main(String[] args) {
        // Create two ArrayLists containing Employee objects
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(101, "John", 30));
        list1.add(new Employee(102, "Alice", 35));
        list1.add(new Employee(103, "Bob", 35));

        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(102, "Alice", 25));
        list2.add(new Employee(104, "Mike", 28));
        list2.add(new Employee(105, "Sarah", 32));

        // Find the matching employee and change its age
        list1.stream().forEach(emp1 -> {
            list2.stream()
                .filter(emp2 -> emp2.getEmpID() == emp1.getEmpID())
                .findFirst()
                .ifPresent(emp2 -> {
                    if (emp2.getAge() != emp1.getAge()) {
                        System.out.println("Matching employee found for ID " + emp1.getEmpID());
                        emp2.setAge(emp1.getAge());
                        System.out.println("Updated age of " + emp2.getName() + " to " + emp2.getAge());
                    } else {
                        System.out.println("Matching employee found, but age is already the same for " + emp2.getName());
                    }
                });
        });

        // Print the modified list2
        list2.forEach(System.out::println);
    }
}

