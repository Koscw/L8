package com.hw.treesettask;

public class Employee {
    private int salary;
    private String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}
