package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect;
            vect = sc.nextLine().split(" ");
            int n = sc.nextInt();
            System.out.println(vect[n]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice não encontrado.");
            e.printStackTrace(); //Vai mostrar no console qual foi a exceção e em quais métodos ocorreu (Pilha de métodos)
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Letras não correspondem à um índice.");
            e.printStackTrace();
            sc.next();
        }

        System.out.println("End program.");


    }
}