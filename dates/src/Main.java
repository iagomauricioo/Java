import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        System.out.println("-------------");

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        System.out.println("-------------");

        Instant d03 = Instant.now(); //Horário de Londres
        System.out.println(d03);
        System.out.println("-------------");

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
        System.out.println("-------------");

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println(d05);
        System.out.println("-------------");

        Instant d06 = Instant.parse("2022-07-20t01:30:26Z");
        System.out.println(d06);
        System.out.println("-------------");

        Instant d07 = Instant.parse("2022-07-20t01:30:26-03:00");
        System.out.println(d07);
        System.out.println("-------------");
    }
}