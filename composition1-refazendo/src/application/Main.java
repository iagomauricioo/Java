package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.printf("%nName: ");
        String name = sc.nextLine();
        System.out.printf("%nLevel: ");
        String level = sc.nextLine();
        System.out.printf("%nBase salary: ");
        double baseSalary = sc.nextDouble();

        Department dep = new Department(departmentName);

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, dep);

        System.out.printf("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contract #%d data: %n", i);

            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours)");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contract);

        }

        sc.nextLine();

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = parseInt(monthAndYear.split("/")[0]);
        int year = parseInt(monthAndYear.split("/")[1]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for %s/%s: %.2f", month, year, worker.income(year, month));
        sc.close();
    }
}