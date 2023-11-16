package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();


        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println("Which percentage to increase salary?");
        double percent = sc.nextDouble();
        employee.increaseSalary(percent);

        System.out.println("Updated data: " + employee.name + ", $ " + employee.grossSalary);



        sc.close();
    }
}