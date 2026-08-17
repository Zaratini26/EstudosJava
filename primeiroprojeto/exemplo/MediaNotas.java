package primeiroprojeto.exemplo;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linha = "-".repeat(25);
        double n1, n2, media;

        System.out.println(linha);
        System.out.print("Digite sua 1° nota: ");
        n1 = teclado.nextDouble();

        System.out.println(linha);
        System.out.print("Digite sua 2° nota: ");
        n2 = teclado.nextDouble();
        
        media = (n1 + n2) / 2;
        
        System.out.println(linha);
        System.out.printf("Sua média final é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Status: Aprovado, parabéns!");

        } else {
            System.out.println("Status: Reprovado, precisa estudar mais!");
        }
        teclado.close();
    }
}
