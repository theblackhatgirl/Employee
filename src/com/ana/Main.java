package com.ana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = scanner.next();
        System.out.println("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: "+employee.name+", $"+employee.netSalary());
        System.out.println("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: "+employee.name+", $"+employee.netSalary());
    }
}
