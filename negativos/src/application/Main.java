package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Quantos números você vai digitar?");
            n = sc.nextInt();
        } while (n < 0 || n > 10);

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

            System.out.println("Números negativos: ");

            int count = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.printf("%.0f%n", vect[i]);
                count++;
            }
        }
            if (count == 0) {
                System.out.println("Todos são positivos.");
            }

    }
}