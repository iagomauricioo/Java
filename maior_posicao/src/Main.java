import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você irá digitar?");

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Maior valor = ");

        double maiorVect = vect[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
               if (vect[i] > maiorVect) {
                    maiorVect = vect[i];
                    posicaoMaior = i;
               }
        }

        System.out.printf("%f%n", maiorVect);
        System.out.printf("Posição do maior = %d", posicaoMaior);
    }
}