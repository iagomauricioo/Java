package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine().toUpperCase();


            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(Color.valueOf(color), width, height));
            }
            else if (ch == 'c') {

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape sp: list) {
            System.out.printf("%.2f%n", sp.area());
        }


    }
}