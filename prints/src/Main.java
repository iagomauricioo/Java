import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Tipo o setLocale em C


        System.out.println("Hello world!!!");
        //printLn serve para printar algo no console e automaticamente
        //já quebrar uma linha

        int n = 256;
        System.out.printf("Valor de n: %d\n", n);
        double n2 = 256.000001;
        System.out.printf("Valor de n2 com 2 casas decimais: %.2f%n", n2);
        System.out.printf("Valor de n2 com 6 casas decimais: %.6f%n", n2);
        String nome = "Iago";
        String sobrenome = "Mauricio";
        int idade = 18;
        System.out.println("Olá, me chamo "+nome+" "+sobrenome+". Tenho "+idade+" anos.");
        System.out.printf("Olá, me chamo %s %s. Tenho %d anos.", nome, sobrenome, idade);
        }
}