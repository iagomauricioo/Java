import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3;
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        sc.close();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        int resultado = s1 + s2 + s3;
        System.out.println("s1 + s2 + s3 = "+ resultado);
    }
}