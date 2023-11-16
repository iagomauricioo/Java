package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + ":");

            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Names: ");
            String name = sc.nextLine();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Não existe esse ID");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees: ");

        for (Employee obj : list) {
            System.out.print(obj.getId() + ", ");
            System.out.print(obj.getName() + ", ");
            System.out.println(obj.getSalary());
        }

        sc.close();
    }

}