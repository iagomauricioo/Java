package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


//C:\\Users\\iagom\\Documents\\IntelliJ IDEA\\arquivos-acesso

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        String parentsPath = path.getParent();

        boolean success = new File(parentsPath + "\\out").mkdir();

        String targetFileStr = parentsPath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];

                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            }
            catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();

    }
}