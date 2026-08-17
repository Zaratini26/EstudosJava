package primeiroprojeto.exemplo;
import java.util.Scanner;

public class ParOuImpar {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linha = "-".repeat(25);

        System.out.println(linha);
        System.out.println("   Bem vindo parceiro");
        System.out.println(linha);
        

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        System.out.println(linha);

        if (num % 2 == 0) {
            System.out.println("Seu número é Par");
            System.out.println(linha);

        } else {
            System.out.println("Seu número é Ímpar");
            System.out.println(linha);
        }
        teclado.close();
    }
}
