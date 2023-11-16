import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String[] vect = new String[] {"Maria", "João", "José"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("------------");

        for (String obj : vect) {
            System.out.println(obj);
        }

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}