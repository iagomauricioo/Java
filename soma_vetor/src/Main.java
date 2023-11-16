//Faça um programa que leia N números reais e
// armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double num;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            num = sc.nextDouble();
            vect[i] = num;


        }

        System.out.printf("Valores = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.2f", sum(vect));
        System.out.println();
        System.out.printf("MEDIA = %.2f", average(vect));

        sc.close();
    }

    public static double sum(double vetor[]) {
        double accumulator = 0;
        for (int i = 0; i < vetor.length; i++) {
            accumulator += vetor[i];
        }
            return accumulator;

    }

    public static double average(double vetor[]){
        double average = 0;
        for (int i = 0; i < vetor.length; i++) {
            average += vetor[i];
        }

        return average / vetor.length;

    }
}