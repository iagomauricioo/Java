import java.util.Scanner;

//Faça um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
public class Main {
    public static void main(String[] args) {
        int x, y, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de x e y, respectivamente: ");
        x = sc.nextInt();
        y = sc.nextInt();
        resultado = x + y;

        System.out.printf("Soma: %d", resultado);
        sc.close();
    }
}