package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        int qtd = sc.nextInt();
        product.addProducts(qtd);

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        int qtdRemove = sc.nextInt();
        product.removeProducts(qtdRemove);

        System.out.println("Updated data: " + product);

        sc.close();
    }
}