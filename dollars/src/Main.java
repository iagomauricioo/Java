package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyCalculator;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyCalculator calc = new CurrencyCalculator();

        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", calc.transform(dollar, quantity));

    }
}