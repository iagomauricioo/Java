package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        product.setPrice(1020.00);

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        int qtd = sc.nextInt();
        product.addProducts(qtd);

        product.setName("Smartphone");
        System.out.println("Updated data: " + product);
        System.out.println("Updated name: " + product.getName());
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        int qtdRemove = sc.nextInt();
        product.removeProducts(qtdRemove);

        System.out.println("Updated data: " + product);

        sc.close();
    }
}