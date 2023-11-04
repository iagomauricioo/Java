import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.printf("Email: ");
        String email = sc.nextLine();

        System.out.printf("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        sc.nextLine();

        System.out.printf("Enter order data:%nStatus: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data:%n", i + 1);

            System.out.printf("Product name: ");
            String productName = sc.nextLine();

            System.out.printf("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.printf("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
            System.out.println("\n" + order);


    }
}