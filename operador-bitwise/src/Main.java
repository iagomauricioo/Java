import java.util.Scanner;

//Testar se o 6º bit é 0 com os operadores bitwise (&, |, ^)
public class Main {
    public static void main(String[] args) {
       int mask = 0b00100000; //0b serve para pegar o binário "0010 0000"
       int n; //Usar o número 113 para testar (0b0111 0001)
       Scanner sc = new Scanner(System.in);

       n = sc.nextInt();
       sc.close();

       if ((n & mask) != 0) {
           System.out.println("6th bit is true");
       }
       else {
           System.out.println("6th bit is false");
       }

    }
}