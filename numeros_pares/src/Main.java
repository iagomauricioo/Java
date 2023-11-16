import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números pares: ");

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                count++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("Quantidade de pares = %d", count);

        sc.close();
    }
}