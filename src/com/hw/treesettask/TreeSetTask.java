package com.hw.treesettask;




import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.Integer.parseInt;

public class TreeSetTask {
    public static void main(String[] args) {
        Comparator<Employee> employeeComparators = new Comparator<Employee>() {


            @Override
            public int compare(Employee l1, Employee l2) {
                if (l1.getSalary() > l2.getSalary()) {
                    return -1;
                } else if (l2.getSalary() > l1.getSalary()) {
                    return 1;
                }
                return 0;
            }
    };

        TreeSet<Employee> employee = new TreeSet<Employee>(employeeComparators);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name , salary ");
        while(true) {

            String n = scanner.nextLine();
            String m = scanner.nextLine();


            if (n.isEmpty()) break;
            employee.add(new Employee(n, parseInt(m)));
            System.out.println("The employee has been added");

        }
        for(Employee q :employee) {
            System.out.println("Employee name: "+q.getName() + " Employee salary: " + q.getSalary());
        }
    }
}
