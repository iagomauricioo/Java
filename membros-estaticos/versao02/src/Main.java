import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI Value: %.2f%n", Calculator.PI);
    }
}