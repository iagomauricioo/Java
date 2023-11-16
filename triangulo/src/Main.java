package application;

import entities.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        sc.close();

        System.out.printf("Triangle X area: %f%n", x.area());
        System.out.printf("Triangle Y area: %f%n", y.area());

        compare(x.area(), y.area());
    }

    public static void compare(double a, double b) {
        if (a > b) {
            System.out.printf("Larger area: X");
        }
        else {
            System.out.printf("Larger area: Y");
        }
    }
}